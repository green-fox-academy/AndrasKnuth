package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
import com.greenfox.foxclub.service.DrinkService;
import com.greenfox.foxclub.service.FoodService;
import com.greenfox.foxclub.service.FoxService;
import com.greenfox.foxclub.service.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  private FoxService foxService;
  @Autowired
  private FoodService foodService;
  @Autowired
  private DrinkService drinkService;
  @Autowired
  private TrickService trickService;

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
  public String loginPage() {
    return "login";
  }
  @PostMapping("/login")
  public String namePass(String name) {
    return "redirect:/?name=" + name;
  }

  @RequestMapping("/nutritionStore")
  public String nutritionSelector(@RequestParam(required = false) String name, Model model) {
    model.addAttribute("foodList", foodService.findAll());
    model.addAttribute("drinkList", drinkService.findAll());
    model.addAttribute("name", name);
    return "nutrition";
  }

  @RequestMapping("/tricks")
  public String trickSelector(@RequestParam(required = false) String name, Model model) {
    model.addAttribute("trickList", trickService.findAll());
    model.addAttribute("name", name);
    return "trick";
  }
}
