package com.restexercise.restexercise.controllers;
import com.restexercise.restexercise.services.NumberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  NumberService numberService;

  public MainController(NumberService numberService){
    this.numberService = numberService;
  }

  @GetMapping("/")
  public String mainPage(){
    return "index";
  }

}
