package org.iesch.jlacastac.skysight.model.prediction.values.streak;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MaxStreak {
    @JsonProperty("value")
    private String value;
    @JsonProperty("periodo")
    private String period;
}
