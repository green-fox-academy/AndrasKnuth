package com.greenfoxacademy.springstart.controllers;

public class Greeting {
  long id;
  String content;

  public Greeting(long id, String content){
    this.content = content;
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
