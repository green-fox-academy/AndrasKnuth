package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
import com.greenfox.foxclub.service.DrinkService;
import com.greenfox.foxclub.service.FoodService;
import com.greenfox.foxclub.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoxController {

  private DrinkService drinkService;
  private FoodService foodService;
  private FoxService foxService;

  public FoxController(DrinkService drinkService, FoodService foodService, FoxService foxService) {
    this.drinkService = drinkService;
    this.foodService = foodService;
    this.foxService = foxService;
  }

  @PostMapping("/nutritionStore")
  public String setNutrition(String food, String drink, String name) {
    Fox fox = foxService.findTheFox(name);
    fox.setFood(food);
    fox.setDrink(drink);
    return "redirect:/?name=" + name;
  }

  @PostMapping("tricks")
  public String setTricks(String trick, String name) {
    Fox fox = foxService.findTheFox(name);
    fox.addTrick(trick);
    return "redirect:/?name=" + name;
  }
}
