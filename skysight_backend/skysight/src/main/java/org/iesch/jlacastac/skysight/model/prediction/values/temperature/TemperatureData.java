package org.iesch.jlacastac.skysight.model.prediction.values.temperature;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TemperatureData {
    @JsonProperty("value")
    private int value;
    @JsonProperty("hora")
    private int hour;
}
