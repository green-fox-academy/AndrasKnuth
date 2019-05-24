package com.foxclub.foxclub.model;

public class Food extends Nutrition{
  private String foodName;
  public Food() {
    super("Food");
  }

  public Food(String foodName){
    super("Food");
    this.foodName = foodName;
  }

  public String getFoodName() {
    return foodName;
  }

  public void setFoodName(String foodName) {
    this.foodName = foodName;
  }
}
