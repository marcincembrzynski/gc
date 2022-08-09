package com.cembrzynski.gemini;


import com.cembrzynski.gemini.model.WeatherApiResponse;
import com.cembrzynski.gemini.response.Weather;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;

    public WeatherService() {
        this.restTemplate = new RestTemplate();
    }

    public Weather getWeatherForCity(String city){
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=02ebee3c9a21db50b26de1a5dd0a88a1&units=metric&mode=json";

        try {
            ResponseEntity<WeatherApiResponse> response = restTemplate.getForEntity(url, WeatherApiResponse.class);

            WeatherApiResponse weatherApiResponse = response.getBody();
            double celciusTemp = weatherApiResponse.getMain().getTemp();
            return new Weather(city, LocalDate.now(), "desc", celciusTemp, celciusTemp, null, null);
        } catch (Exception ex){
            throw new NotValidCityException();
        }
    }
}
