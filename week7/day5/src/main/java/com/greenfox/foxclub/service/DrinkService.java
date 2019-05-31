package com.greenfox.foxclub.service;
import com.greenfox.foxclub.model.Drink;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DrinkService {
  ArrayList<String> drinks;

  public DrinkService() {
    drinks = new ArrayList<>();
    drinks.add("Oat Milk Latte");
    drinks.add("Still Water");
    drinks.add("Natural Wine");
    drinks.add("Indian Pale Ale");
    drinks.add("Apricot Juice");
  }

  public List<String> findAll() {
    return drinks;
  }
}
