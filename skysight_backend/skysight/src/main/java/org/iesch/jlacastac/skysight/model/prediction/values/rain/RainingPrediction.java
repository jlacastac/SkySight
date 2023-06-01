package org.iesch.jlacastac.skysight.model.prediction.values.rain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RainingPrediction {
    @JsonProperty("value")
    private int value;
    @JsonProperty("periodo")
    private String period;
}
