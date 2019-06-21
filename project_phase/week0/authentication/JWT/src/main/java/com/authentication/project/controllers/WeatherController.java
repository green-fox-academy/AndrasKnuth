package com.authentication.project.controllers;

import com.authentication.project.WeatherClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WeatherController {

  private WeatherClient weatherClient;

  @Autowired
  public WeatherController(WeatherClient weatherClient) {
    this.weatherClient = weatherClient;
  }

  @GetMapping("/weather")
  public ResponseEntity showWeather() {
    try {
      return ResponseEntity.ok().body(weatherClient.getWeather());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return ResponseEntity.badRequest().build();
  }
}
