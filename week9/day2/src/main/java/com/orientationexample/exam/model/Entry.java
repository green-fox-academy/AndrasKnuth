package com.orientationexample.exam.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Entry {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String url;
  private String alias;
  @JsonIgnore
  private int secretCode;
  private int hitCount;

  public Entry() {
  }

  public Entry(String url, String alias) {
    this.alias = alias;
    this.url = url;
  }

  public void incrementHitCount(){
    hitCount++;
  }
}
