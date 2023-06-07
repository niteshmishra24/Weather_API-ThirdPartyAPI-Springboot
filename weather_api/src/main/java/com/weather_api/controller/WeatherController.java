package com.weather_api.controller;

import com.weather_api.model.WeatherResponse;
import com.weather_api.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather/{cityName}")
    public Mono<WeatherResponse> getWeatherByCityName(@PathVariable String cityName) {
        return weatherService.getWeatherByCityName(cityName);
    }
}
