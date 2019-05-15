package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  String name = "Andras";
  @RequestMapping( value = "/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam String name){
    return new Greeting(1, "Hello, " + name + "!");
  }
}

/*
Add greeting method and use @RequestMapping annotation.
Create and return a Greeting object when it is called.
Recompile app (use the "Make Project (Ctrl-F9" at the top of your project if you've
edited the existing project and are restarting)
Open http://localhost:8080/greeting in your web browser
Your output should look like: {"id":1,"content":"Hello, World!"}
 */