package com.hellobeanworld.hellobeanworld;
import com.hellobeanworld.hellobeanworld.component.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  @Autowired
  Printer printer;



  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    printer.log("Hello");
  }

}
