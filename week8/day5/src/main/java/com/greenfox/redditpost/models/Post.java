package com.greenfox.redditpost.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private int popularity = 0;
  private String title;
  private String content;

  public Post(){

  }
public Post(String title){
    this.title = title;
}


}
