package org.iesch.jlacastac.skysight.model.prediction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Origin {
    @JsonProperty("productor")
    private String producer;
    @JsonProperty("web")
    private String web;
    @JsonProperty("enlace")
    private String link;
    @JsonProperty("language")
    private String language;
    @JsonProperty("copyright")
    private String copyright;
    @JsonProperty("notaLegal")
    private String legalNote;

}
