package com.simbabank.simbabank.models;

public class BankAccount {
private String name;
private Double balance;
private String animalType;
private String balanceType;

public BankAccount(String name, Double balance, String animalType, String balanceType){
  this.name = name;
  this.balance = balance;
  this.animalType = animalType;
  this.balanceType = balanceType;
}
  public String getName() {
    return name;
  }

  public Double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getBalanceType() {
    return balanceType;
  }
}
