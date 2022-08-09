package com.cembrzynski.gemini.model;

import lombok.Data;

@Data
public class WeatherDescription {
    private long id;
    private String main;
    private String description;
    private String icon;
}
