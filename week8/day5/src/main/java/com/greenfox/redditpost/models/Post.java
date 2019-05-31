package com.greenfox.redditpost.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private int popularity = 0;
  private String title;
  private String content;
  private String url;

  public Post() {
  }

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
  }

  public void setPopularity(int popularity) {
    this.popularity = popularity;
  }

  public int getPopularity() {
    return popularity;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
