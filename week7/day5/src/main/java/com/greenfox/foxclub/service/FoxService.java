package com.greenfox.foxclub.service;
import com.greenfox.foxclub.model.Fox;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class FoxService {

  ArrayList<Fox> foxes;

  public FoxService() {
    foxes = new ArrayList<>();
  }

  public void addNewFox(Fox fox) {
    foxes.add(fox);
  }


}
