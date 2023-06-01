package org.iesch.jlacastac.skysight.model.prediction;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PredictionResponse {
    @JsonProperty("origen")
    private Origin origin;
    @JsonProperty("elaborado")
    private String made;
    @JsonProperty("nombre")
    private String name;
    @JsonProperty("provincia")
    private String province;
    @JsonProperty("prediccion")
    private Prediction prediction;
    @JsonProperty("id")
    private int id;
    @JsonProperty("version")
    private String version;
}
