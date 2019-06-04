package com.restexercise.restexercise.controllers;
import com.restexercise.restexercise.models.*;
import com.restexercise.restexercise.models.Error;
import com.restexercise.restexercise.services.AppendService;
import com.restexercise.restexercise.services.MessageService;
import com.restexercise.restexercise.services.NumberService;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
  NumberService numberService;
  MessageService messageService;
  AppendService appendService;

  public Controller(NumberService numberService, MessageService messageService, AppendService appendService) {
    this.numberService = numberService;
    this.messageService = messageService;
    this.appendService = appendService;
  }

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(name = "input", required = false) Integer number) {
    if (number == null) {
      return new Error("Please provide an input.");
    } else {
      return numberService.doubling(number);
    }
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(required = false) String name, String title) {
    if (name == null && title == null) {
      return new Error("Please provide a name and a title!");
    } else if (name == null) {
      return new Error("Please provide a name!");
    } else if (title == null) {
      return new Error("Please provide a title!");
    } else {
      return new Message("Oh, hi there Mark, my dear student!"/*
      <- This is for testing purposes, normal here: messageService.welcome_message(name, title)*/);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appended(@PathVariable("appendable") String append) {
    return appendService.appenda(append);
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable("action") String action,
                        @RequestBody Until until) {
    if (action != null && until != null) {
      return numberService.doAction(action, until.getUntil());
    } else {
      return new Error("Please provide a number!");
    }
  }

}
