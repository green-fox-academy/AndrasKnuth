package com.jwt.demo.services;


import com.jwt.demo.modells.GitHubUser;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubUserInterface {

  @GET("/users/{username}")
  Call<GitHubUser> getUser(@Path("username") String username);
}
