package com.foxclub.foxclub.model;

public class Drink extends Nutrition{
  private String drinkName;
  public Drink() {
    super("Drink");
  }

  public Drink(String drinkName){
    super("Drink");
    this.drinkName = drinkName;
  }

  public String getDrinkName() {
    return drinkName;
  }

  public void setDrinkName(String drinkName) {
    this.drinkName = drinkName;
  }
}
