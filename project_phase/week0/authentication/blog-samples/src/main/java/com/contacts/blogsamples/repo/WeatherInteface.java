package com.contacts.blogsamples.repo;

import com.contacts.blogsamples.modells.Weather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherInteface {
@GET("/v1.0/getAemetStation/{stationName}/{period}/")
Call<Weather> showWeather(@Path("stationName") String stationName, @Path("period") String period);
}
