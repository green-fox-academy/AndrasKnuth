package com.contacts.blogsamples.controllers;

import com.contacts.blogsamples.services.WeatherClient;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
