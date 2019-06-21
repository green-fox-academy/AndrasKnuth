package com.authentication.project.controllers;

import com.authentication.project.modells.Weather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherInterface {
  @GET("/v1.0/getAemetStation/{stationName}/{period}/")
  Call<Weather> showWeather(@Path("stationName") String stationName, @Path("period") String period);
}
