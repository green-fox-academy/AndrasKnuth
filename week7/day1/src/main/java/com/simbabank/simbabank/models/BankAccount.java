package com.simbabank.simbabank.models;

public class BankAccount {
  private static int nextId = 0;
  private String name;
  private Double balance;
  private String animalType;
  private String currency;
  private int id;
  private boolean king;
  private boolean bad;

  public BankAccount(){
  }

  public BankAccount(String name, Double balance, String animalType, String currency, boolean king, boolean bad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = currency;
    this.id = nextId++;
    this.king = king;
    this.bad = bad;
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

  public String getCurrency() {
    return currency;
  }

  public int getId() {
    return id;
  }

  public boolean isKing() {
    return king;
  }

  public boolean isBad() {
    return bad;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public void setBad(boolean bad) {
    this.bad = bad;
  }

  public void setKing(boolean king) {
    this.king = king;
  }
}
