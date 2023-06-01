package org.iesch.jlacastac.skysight.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesch.jlacastac.skysight.model.Response;
import org.iesch.jlacastac.skysight.model.municipality.Municipality;
import org.iesch.jlacastac.skysight.model.prediction.PredictionResponse;
import org.iesch.jlacastac.skysight.repository.MunicipalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AemetService {

    private static HttpHeaders headers;
    private static HttpEntity<String> entity;

    @Value("${aemet.key}")
    private String apiKey;
    @Value("${aemet.url}")
    private String apiUrl;

    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    MunicipalityRepository municipalityRepository;

    private static String uri;

    public void setRequest(String endpoint) {
        setHeaders();
        setUri(endpoint);
    }

    private void setHeaders() {
        headers = new HttpHeaders();
        headers.set("api_key", apiKey);

        entity = new HttpEntity<>("parameters", headers);
    }

    private void setUri(String endpoint) {
        uri = apiUrl + endpoint;
    }

    public PredictionResponse getPrediction(int id) {
        setRequest("prediccion/especifica/municipio/diaria/");

        ResponseEntity<Response> response = restTemplate.exchange(
        uri + id, HttpMethod.GET, entity, Response.class
        );

        ResponseEntity<String> prediction = restTemplate.exchange(
            response.getBody().getData(), HttpMethod.GET, null, String.class
        );

        try {
            return objectMapper.readValue(prediction.getBody()
                    .substring(1, prediction.getBody().length() - 1), PredictionResponse.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Municipality> getMunicipalities() {
        setRequest("maestro/municipios");

        ResponseEntity<String> response = restTemplate.exchange(
                uri, HttpMethod.GET, entity, String.class
        );

        try {
            return objectMapper.readValue(response.getBody(), new TypeReference<List<Municipality>>() {});
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateMunicipalities() {
        municipalityRepository.deleteAll();
        municipalityRepository.saveAll(getMunicipalities());
    }
}
