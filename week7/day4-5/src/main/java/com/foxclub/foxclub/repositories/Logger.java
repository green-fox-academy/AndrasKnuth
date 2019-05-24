package com.foxclub.foxclub.repositories;

import com.foxclub.foxclub.model.Nutrition;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class Logger {
  private List<String> actionList = new ArrayList<>();
  private List<String> lastFiveActionList = new ArrayList<>();

  public Logger() {
  }

  public List<String> getLastFiveActionList() {
    return lastFiveActionList;
  }

  public void setLastFiveActionList(List<String> lastFiveActionList) {
    this.lastFiveActionList = lastFiveActionList;
  }

  public String getDatetime() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    Date date = new Date();
    return dateFormat.format(date);
  }

  public void saveLoginAction() {
    actionList.clear();
    String message = getDatetime() + ": logged in.";
    actionList.add(message);
  }

  public void saveNutritionChange(Nutrition nutrition, String before, String after) {
    String message = getDatetime() + ": " + nutrition.getType() + " changed from " + before + " to " + after;
    actionList.add(message);
  }

  public void saveTrickAction(String trick) {
    String message = getDatetime() + ": " + "Learned to " + trick;
    actionList.add(message);
  }

  public List<String> getActionList() {
    return actionList;
  }

  public void setActionList(List<String> actionList) {
    this.actionList = actionList;
  }

  public List<String> getLastFiveAction() {
    lastFiveActionList.clear();
    if (actionList.size() > 0) {
      for (int i = actionList.size() -1; i >= 0; i--) {
        if (lastFiveActionList.size() == 5) {
          break;
        }
        lastFiveActionList.add(actionList.get(i));
      }
    }
    return lastFiveActionList;
  }
}
