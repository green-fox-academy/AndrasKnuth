package com.greenfoxacademy.springstart.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

public class WebGreetCounter {
  AtomicLong counter = new AtomicLong();

  @RequestMapping("/web/greetingscounter")
  public String greeting(Model model, @RequestParam String name) {
    model.addAttribute("name", name);
    model.addAttribute("counter", counter.incrementAndGet());
    return "greetingscounter";
  }
}
