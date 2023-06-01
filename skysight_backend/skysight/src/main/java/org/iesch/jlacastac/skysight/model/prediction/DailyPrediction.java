package org.iesch.jlacastac.skysight.model.prediction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.iesch.jlacastac.skysight.model.prediction.values.humidity.RelativeHumidity;
import org.iesch.jlacastac.skysight.model.prediction.values.rain.RainingPrediction;
import org.iesch.jlacastac.skysight.model.prediction.values.sky.SkyPrediction;
import org.iesch.jlacastac.skysight.model.prediction.values.streak.MaxStreak;
import org.iesch.jlacastac.skysight.model.prediction.values.snow.SnowPrediction;
import org.iesch.jlacastac.skysight.model.prediction.values.temperature.TemperaturePrediction;
import org.iesch.jlacastac.skysight.model.prediction.values.thermal.ThermalSensation;
import org.iesch.jlacastac.skysight.model.prediction.values.wind.WindPrediction;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DailyPrediction {
    @JsonProperty("probPrecipitacion")
    private List<RainingPrediction> rainingPredictions;
    @JsonProperty("cotaNieveProv")
    private List<SnowPrediction> snowPredictions;
    @JsonProperty("estadoCielo")
    private List<SkyPrediction> skyPredictions;
    @JsonProperty("viento")
    private List<WindPrediction> windPredictions;
    @JsonProperty("rachaMax")
    private List<MaxStreak> maxStreaksPredictions;
    @JsonProperty("temperatura")
    private TemperaturePrediction temperaturePredictions;
    @JsonProperty("sensTermica")
    private ThermalSensation thermalSensationPredictions;
    @JsonProperty("humedadRelativa")
    private RelativeHumidity relativeHumiditiyPredictions;
    @JsonProperty("uvMax")
    private int uvMax;
    @JsonProperty("fecha")
    private String date;
}
