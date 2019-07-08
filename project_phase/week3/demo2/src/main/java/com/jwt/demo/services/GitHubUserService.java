package com.jwt.demo.services;

import com.jwt.demo.modells.GitHubUser;
import com.jwt.demo.repositories.UserRepository;
import java.io.IOException;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class GitHubUserService {

  private GitHubUserInterface service;
  private UserRepository userRepository;

  public GitHubUserService(UserRepository userRepository) {
    this.userRepository = userRepository;
    String API_BASE_URL = "https://api.github.com/";
    Retrofit retrofit =
        new Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    service = retrofit.create(GitHubUserInterface.class);
  }

  public GitHubUser getUser(String username) throws IOException {
    Call<GitHubUser> callSync = service.getUser(username);

    Response<GitHubUser> response = callSync.execute();

    if (!response.isSuccessful()) {
      throw new IOException(
          response.errorBody() != null ? response.errorBody().string() : "Unknown Error");
    }
    return response.body();
  }

  public void save(GitHubUser gitHubUser) {
    userRepository.save(gitHubUser);
  }
}
