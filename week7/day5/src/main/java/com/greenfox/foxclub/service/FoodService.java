package com.greenfox.foxclub.service;

import com.greenfox.foxclub.model.Food;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {
  List<Food> foods;

  public FoodService() {
    foods = new ArrayList<>();
  }

  public void addNewFood(Food food) {
    foods.add(food);
  }
}
