package com.cembrzynski.gemini.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {
    private String city;
    private LocalDate localDate;
    private String description;
    private double tempCelcius;
    private double tempFahrenheit;
    private LocalDateTime sunrise;
    private LocalDateTime sunset;

}
