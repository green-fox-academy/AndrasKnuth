package com.greenfox.gfa.gfa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GfaController {

  @GetMapping("/gfa")
  public String mainPage(){
    return "gfa";
  }
}
