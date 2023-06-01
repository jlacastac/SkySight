package org.iesch.jlacastac.skysight.model.prediction.values.temperature;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TemperaturePrediction {
    @JsonProperty("maxima")
    private int maximum;
    @JsonProperty("minima")
    private int minimum;
    @JsonProperty("dato")
    private List<TemperatureData> data;
}
