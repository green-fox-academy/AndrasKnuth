package com.restexercise.restexercise.services;

import com.restexercise.restexercise.models.Append;
import org.springframework.stereotype.Service;

@Service
public class AppendService {
  public Append appenda(String  append){
    Append myAppend = new Append();
    myAppend.setAppend(append + "a");
    return myAppend;
  }
}
