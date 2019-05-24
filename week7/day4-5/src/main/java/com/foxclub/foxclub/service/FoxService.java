package com.foxclub.foxclub.service;

import com.foxclub.foxclub.controller.MainController;
import com.foxclub.foxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class FoxService {

  private MainController mainController;

  public FoxService() {
  }

  public void login(Fox fox) {
    mainController.setActiveFoxIndex(mainController.getFoxList().getFoxIndex(fox));
  }
  public void logout() {
    mainController.setActiveFoxIndex(0);
  }

  public MainController getMainController() {
    return mainController;
  }

  public void setMainController(MainController mainController) {
    this.mainController = mainController;
  }
}