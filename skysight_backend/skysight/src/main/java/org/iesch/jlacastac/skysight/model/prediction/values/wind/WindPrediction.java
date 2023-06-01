package org.iesch.jlacastac.skysight.model.prediction.values.wind;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WindPrediction {
    @JsonProperty("direccion")
    private String direction;
    @JsonProperty("velocidad")
    private int speed;
    @JsonProperty("periodo")
    private String period;
}
