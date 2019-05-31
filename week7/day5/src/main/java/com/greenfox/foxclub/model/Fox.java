package com.greenfox.foxclub.model;

import java.util.ArrayList;

public class Fox {
  private String foxName;
  private ArrayList<String> listOfTricks = new ArrayList<>();
  private String food;
  private String drink;


  public Fox(String foxName) {
    this.foxName = foxName;
  }

  public String getFoxName() {
    return foxName;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public ArrayList<String> getListOfTricks() {
    return listOfTricks;
  }

  public void addTrick(String trick) {
    listOfTricks.add(trick);
  }

  public boolean checkTrickList() {
    if (listOfTricks.size() == 0) {
      return true;
    } else return false;
  }

}
