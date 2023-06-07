package com.weather_api.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class MainData {

    private Double temp;
    @JsonProperty("feels_like")
    private Double feelsLike;
    @JsonProperty("temp_min")
    private Double tempMin;
    @JsonProperty("temp_max")
    private Double tempMax;
    private Integer pressure;
    private Integer humidity;
    public Double getTemp() {
        return temp;
    }
    public void setTemp(Double temp) {
        this.temp = temp;
    }
    public Double getFeelsLike() {
        return feelsLike;
    }
    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }
    public Double getTempMin() {
        return tempMin;
    }
    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }
    public Double getTempMax() {
        return tempMax;
    }
    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }
    public Integer getPressure() {
        return pressure;
    }
    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }
    public Integer getHumidity() {
        return humidity;
    }
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }
    public MainData(Double temp, Double feelsLike, Double tempMin, Double tempMax, Integer pressure, Integer humidity) {
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.humidity = humidity;
    }
    public MainData() {
    }

    // getters and setters
    
}

