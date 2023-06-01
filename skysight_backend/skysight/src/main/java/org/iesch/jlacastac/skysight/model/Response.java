package org.iesch.jlacastac.skysight.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Response {
    @JsonProperty("descripcion")
    private String description;
    @JsonProperty("estado")
    private int state;
    @JsonProperty("datos")
    private String data;
    @JsonProperty("metadatos")
    private String metadata;
}
