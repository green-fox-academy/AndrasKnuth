package com.greenfox.foxclub.service;
import com.greenfox.foxclub.model.Drink;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DrinkService {
  List<Drink> drinks;

  public DrinkService() {
    drinks = new ArrayList<>();
  }

  public void addNewDrink(Drink drink) {
    drinks.add(drink);
  }
}
