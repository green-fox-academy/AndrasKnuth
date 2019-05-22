package com.hellobeanworld.hellobeanworld.model;

import com.hellobeanworld.hellobeanworld.component.MyColor;
import com.hellobeanworld.hellobeanworld.component.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Green implements MyColor {
  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("This is green.");
  }
}
