package com.vogella.retrofitgerrit;

import java.io.IOException;
import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClass {

  OkHttpClient okHttpClient = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() {
    @Override
    public okhttp3.Response intercept(Chain chain) throws IOException {
      Request originalRequest = chain.request();

      Request.Builder builder = originalRequest.newBuilder().header("Authorization",
          Credentials.basic("aUsername", "aPassword"));

      Request newRequest = builder.build();
      return chain.proceed(newRequest);
    }
  }).build();

  Retrofit retrofit = new Retrofit.Builder()
      .baseUrl("https://api.example.com")
      .client(okHttpClient)
      .build();
}
