package com.greenfox.foxclub.model;

public class Fox {
  private String name;
  private Food food;
  private Drink drink;

  public Fox(String name){
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
}
