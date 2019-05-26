package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
import com.greenfox.foxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  private FoxService foxService;

  @RequestMapping("/")
  public String index(Model model, @RequestParam(required = false) String name) {
    if (name == null) {
      return "login";
    } else {
      Fox fox = new Fox(name);
      model.addAttribute("fox", fox);
      foxService.addNewFox(fox);
    }
    return "index";
  }

  @GetMapping("/login")
  public String renderLogin(@RequestParam(required = false) String name) {
    return "login";
  }

  @PostMapping("/login")
  public String namePost(String name) {
    return "redirect:/?name=" + name;
  }

  @RequestMapping("/nutritionStore")
  public String nutritionSelector(@RequestParam String name) {
    if (name == null) {
      return "login";
    } else {

      return "nutrition";
    }
  }
}
