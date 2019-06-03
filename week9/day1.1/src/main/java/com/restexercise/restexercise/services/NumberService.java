package com.restexercise.restexercise.services;
import com.restexercise.restexercise.models.Number;
import org.springframework.stereotype.Service;

@Service
public class NumberService {

  public Number doubling(int myNumber){
    return new Number(myNumber, myNumber*2);
  }
}
