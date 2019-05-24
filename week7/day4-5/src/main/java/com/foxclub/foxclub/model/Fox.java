package com.foxclub.foxclub.model;
import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private Food food;
  private Drink drink;
  private List<String> trickList = new ArrayList<>();

  public Fox (){
    this("", new Food(), new Drink());
    trickList.add("Eating");

  }

  public Fox(String name){
    this.name = name;
  }
  public Fox(String name, Food food, Drink drink){
    this.name = name;
    this.food = food;
    this.drink = drink;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDrink(Drink drink) {
    this.drink = drink;
  }

  public void setFood(Food food) {
    this.food = food;
  }

  public Drink getDrink() {
    return drink;
  }

  public Food getFood() {
    return food;
  }

  public void setTrickList(List<String> trickList) {
    this.trickList = trickList;
  }

  public List<String> getTrickList() {
    return trickList;
  }

  public boolean addTrick(String trick){
    if (trickList.contains(trick)){
      return false;
    } else{
      trickList.add(trick);
      return true;
    }
  }
}
