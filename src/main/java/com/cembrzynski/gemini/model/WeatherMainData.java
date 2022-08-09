package com.cembrzynski.gemini.model;

import lombok.Data;

@Data
public class WeatherMainData {
    private double temp;
    private WeatherDescription weatherDescription;
}
