package com.restexercise.restexercise.models;


public class Number {
  private int received;
  private int result;

  public Number(int received, int result){
    this.received = received;
    this.result = result;
  }

  public doAction(){

  }

  public void setReceived(int received) {
    this.received = received;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }
}
