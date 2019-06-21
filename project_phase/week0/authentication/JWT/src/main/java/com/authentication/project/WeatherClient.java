package com.authentication.project;

import com.authentication.project.controllers.WeatherInterface;
import com.authentication.project.modells.Weather;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Component
public class WeatherClient {

  private WeatherInterface weatherInterface;

  public WeatherClient() {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("http://api.oceandrivers.com:80")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    this.weatherInterface = retrofit.create(WeatherInterface.class);
  }

  public Weather getWeather() throws IOException {
    Call<Weather> callSync = weatherInterface.showWeather("aeropuertopalma", "lastdata");

    Response<Weather> response = callSync.execute();
    return response.body();
  }

}
