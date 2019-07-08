package com.jwt.demo.modells;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GitHubUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String login;
  private String url;

  public GitHubUser() {}

  public GitHubUser(String login, String url) {
    this.login = login;
    this.url = url;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
