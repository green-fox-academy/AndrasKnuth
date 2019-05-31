package com.greenfox.foxclub.service;
import com.greenfox.foxclub.model.Fox;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

  List<Fox> foxes;

  public FoxService() {
    foxes = new ArrayList<>();
  }

  public void addNewFox(Fox fox) {
    foxes.add(fox);
  }

  public boolean searchForFox(String name) {
    for(Fox fox : foxes) {
      if(name.equals(fox.getFoxName())) {
        return true;
      }
    }
    return false;
  }

  public Fox findTheFox(String name) {
    for(Fox fox : foxes) {
      if(name.equals(fox.getFoxName())) {
        return fox;
      }
    }
    return new Fox(name);
  }

  public List<Fox> getFoxes() {
    return foxes;
  }


}
