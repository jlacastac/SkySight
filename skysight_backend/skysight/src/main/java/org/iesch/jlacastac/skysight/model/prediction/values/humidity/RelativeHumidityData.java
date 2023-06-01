package org.iesch.jlacastac.skysight.model.prediction.values.humidity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RelativeHumidityData {
    @JsonProperty("value")
    private int value;
    @JsonProperty("hora")
    private int hour;
}
