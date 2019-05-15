package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong counter = new AtomicLong();
  @RequestMapping( value = "/greeting")
  @ResponseBody
  public Greeting helloRest(@RequestParam String name){
    return new Greeting(counter.incrementAndGet(), "Hello, " + name + "!");
  }
}
