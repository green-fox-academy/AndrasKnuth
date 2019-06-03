package com.restexercise.restexercise.models;

public class Message {
  private String welcome_message = "";


  public Message(){
  }

  public Message(String welcome_message){
    this.welcome_message = welcome_message;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
