package com.zoezn.weatherservice.controller;

import com.zoezn.weatherservice.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("weather")
public class WeatherController {
    @Autowired
    WeatherService weatherService;

    @GetMapping()
    public String getWeather(@RequestParam String city, @RequestParam String country){
        return "Weather in " + city + ", " + country + " is: " + weatherService.getWeatherFrom(city, country) + "°C";
    }
}
