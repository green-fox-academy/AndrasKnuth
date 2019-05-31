package com.greenfox.foxclub.service;

import com.greenfox.foxclub.model.Food;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {
  ArrayList<String> foods;

  public FoodService() {
    foods = new ArrayList<>();
    foods.add("Green Salad");
    foods.add("Red Lentil Curry");
    foods.add("Pad Thai");
    foods.add("Vegan Pizza");
    foods.add("Sweet Potato Browne");
  }

  public List<String> findAll() {
    return foods;
  }
}
