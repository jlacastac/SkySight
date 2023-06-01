package org.iesch.jlacastac.skysight.model.municipality;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Municipality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    @JsonProperty("latitud")
    private String latitude;
    @JsonProperty("id_old")
    private int idOld;
    @JsonProperty("url")
    private String url;
    @JsonProperty("latitud_dec")
    private String latitudeDecimal;
    @JsonProperty("altitud")
    private int altitude;
    @JsonProperty("capital")
    private String capital;
    @JsonProperty("num_hab")
    private int habitants;
    @JsonProperty("zona_comarcal")
    private int comarcalZone;
    @JsonProperty("destacada")
    private int checked;
    @JsonProperty("nombre")
    private String name;
    @JsonProperty("longitud_dec")
    private String longitudeDecimal;
    @JsonProperty("id")
    private String aemetId;
    @JsonProperty("longitud")
    private String longitude;
}
