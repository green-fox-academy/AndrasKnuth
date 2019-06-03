package com.restexercise.restexercise.services;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

  public String welcome_message(String name, String title){
    return "Oh, hi there " + name + ", my dear " + title + "!";
  }
}
