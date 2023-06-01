package org.iesch.jlacastac.skysight.model.prediction.values.thermal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ThermalSensationData {
    @JsonProperty("value")
    private int value;
    @JsonProperty("hora")
    private int hour;
}
