package com.hellobeanworld.hellobeanworld;
import com.hellobeanworld.hellobeanworld.component.Printer;
import com.hellobeanworld.hellobeanworld.model.Blue;
import com.hellobeanworld.hellobeanworld.model.Green;
import com.hellobeanworld.hellobeanworld.model.Red;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  @Autowired
  Printer printer;

  @Autowired
  Blue blue;

  @Autowired
  Green green;

  @Autowired
  Red red;

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("Hello");
    blue.printColor();
    green.printColor();
    red.printColor();
  }



}
