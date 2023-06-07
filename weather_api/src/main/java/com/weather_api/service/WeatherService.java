package com.weather_api.service;

import com.weather_api.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    public Mono<WeatherResponse> getWeatherByCityName(String cityName) {
        return webClientBuilder.build()
                .get()
                .uri(String.format("https://open-weather13.p.rapidapi.com/city/%s", cityName))
                .header("X-RapidAPI-Key", "de15e63f8emshcce663e2811d74cp1debe9jsn52245d3bc818")
                .header("X-RapidAPI-Host", "open-weather13.p.rapidapi.com")
                .retrieve()
                .bodyToMono(WeatherResponse.class);
    }
}
