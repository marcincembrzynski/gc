package com.cembrzynski.gemini.model;

import lombok.Data;

import java.util.Map;

@Data
public class WeatherApiResponse {
    private WeatherMainData main;
    //private Map<String, String> weather;
}
