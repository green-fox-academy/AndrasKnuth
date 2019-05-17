package com.basicwebshop.webshop.Controllers;

import com.basicwebshop.webshop.Models.ShopItem;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
  public void listFill(){
    List<ShopItem> shopItemList = new ArrayList<>();
    shopItemList.add(new ShopItem("Running Shoes", "Nike running shoes for everyday use",
        140.0, 5 ));
    shopItemList.add(new ShopItem("Printer", "Some HP printer",
        39.9, 2 ));
    shopItemList.add(new ShopItem("Coca Cola", "0.5l standard coke",
        2.0, 0 ));
    shopItemList.add(new ShopItem("Wkoin", "Chicken with fried rice and WOKIN sauce",
        4.9, 100 ));
    shopItemList.add(new ShopItem("T-shirt", "Blue with corgi on a bike",
        9.9, 5 ));
  }
}
