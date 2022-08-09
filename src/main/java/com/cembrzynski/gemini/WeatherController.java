package com.cembrzynski.gemini;

import com.cembrzynski.gemini.response.Weather;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }


    @GetMapping("/weather/{city}")
    public ResponseEntity<Weather> getWeatherForCity(@PathVariable("city") String city){
        try {
            return ResponseEntity.ok(weatherService.getWeatherForCity(city));
        } catch (NotValidCityException ex){
            return ResponseEntity.notFound().build();
        }
    }
}
