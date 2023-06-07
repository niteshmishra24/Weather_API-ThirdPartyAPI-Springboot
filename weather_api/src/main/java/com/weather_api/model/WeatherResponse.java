package com.weather_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    @JsonProperty("main")
    private MainData main;

    @JsonProperty("name")
    private String name;

    public MainData getMain() {
        return main;
    }

    public void setMain(MainData main) {
        this.main = main;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeatherResponse(MainData main, String name) {
        this.main = main;
        this.name = name;
    }

    public WeatherResponse() {
    }

    

    // getters and setters
}
