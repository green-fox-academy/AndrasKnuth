package com.mysqlconnection.connect;

import com.mysqlconnection.connect.models.Todo;
import com.mysqlconnection.connect.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ConnectApplication.class, args);
  }

  @Autowired
  TodoRepo todoRepo;


  @Override
  public void run(String... args) throws Exception {
    todoRepo.save(new Todo("I have to learn"));
    todoRepo.save(new Todo("I have to practice."));
    todoRepo.save(new Todo("Setup tinder."));
  }
}
