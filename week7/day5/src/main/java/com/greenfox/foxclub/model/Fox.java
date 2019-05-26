package com.greenfox.foxclub.model;

import java.util.ArrayList;

public class Fox {
  private String foxName;
  private ArrayList<String> listOfTricks = new ArrayList<>();

  public Fox(String foxName) {
    this.foxName = foxName;
  }

  public String getFoxName() {
    return foxName;
  }

  public ArrayList<String> getListOfTricks() {
    return listOfTricks;
  }
}
