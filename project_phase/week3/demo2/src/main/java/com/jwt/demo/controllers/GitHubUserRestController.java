package com.jwt.demo.controllers;


import com.jwt.demo.modells.GitHubUser;
import com.jwt.demo.services.GitHubUserService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubUserRestController {

  private GitHubUserService gitHubUserService;

  @Autowired
  public GitHubUserRestController(GitHubUserService gitHubUserService) {
    this.gitHubUserService = gitHubUserService;
  }

  @GetMapping("/users/{username}")
  public GitHubUser getUser(@PathVariable("username") String username) throws IOException {
    gitHubUserService.save(gitHubUserService.getUser(username));
    return gitHubUserService.getUser(username);
  }
}
