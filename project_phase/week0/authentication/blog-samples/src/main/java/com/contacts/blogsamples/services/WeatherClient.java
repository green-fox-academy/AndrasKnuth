package com.contacts.blogsamples.services;

import com.contacts.blogsamples.modells.Weather;
import com.contacts.blogsamples.repo.WeatherInteface;
import java.io.IOException;
import org.springframework.stereotype.Component;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Component
public class WeatherClient {

  private WeatherInteface weatherInteface;

  public WeatherClient() {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("http://api.oceandrivers.com:80")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    this.weatherInteface = retrofit.create(WeatherInteface.class);
  }

  public Weather getWeather() throws IOException {
    Call<Weather> callSync = weatherInteface.showWeather("aeropuertopalma", "lastdata");

    Response<Weather> response = callSync.execute();
    return response.body();
  }

}