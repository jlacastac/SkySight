package org.iesch.jlacastac.skysight.model.prediction.values.humidity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class RelativeHumidity {
    @JsonProperty("maxima")
    private int maximum;
    @JsonProperty("minima")
    private int minimum;
    @JsonProperty("dato")
    private List<RelativeHumidityData> data;
}
