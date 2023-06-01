package org.iesch.jlacastac.skysight.model.prediction.values.sky;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SkyPrediction {
    @JsonProperty("value")
    private String value;
    @JsonProperty("periodo")
    private String period;
    @JsonProperty("descripcion")
    private String description;
}
