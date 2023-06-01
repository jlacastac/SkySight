package org.iesch.jlacastac.skysight.model.prediction.values.snow;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SnowPrediction {
    @JsonProperty("value")
    private String value;
    @JsonProperty("periodo")
    private String period;
}
