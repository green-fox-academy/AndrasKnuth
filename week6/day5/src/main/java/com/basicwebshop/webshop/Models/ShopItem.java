package com.basicwebshop.webshop.Models;

import java.util.ArrayList;
import java.util.List;

public class ShopItem {
  String name;
  String description;
  Double price;
  int quantityOfStock;

  public ShopItem(String name, String description, Double price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public void setQuantityOfStock(int quantityOfStock) {
    this.quantityOfStock = quantityOfStock;
  }

  public List<ShopItem> toList() {
    List<ShopItem> shopItemList = new ArrayList<>();
    shopItemList.add(this);
    return shopItemList;
  }
}
