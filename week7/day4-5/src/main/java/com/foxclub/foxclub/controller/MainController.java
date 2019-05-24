package com.foxclub.foxclub.controller;
import com.foxclub.foxclub.model.Fox;
import com.foxclub.foxclub.repositories.Logger;
import com.foxclub.foxclub.service.FoxList;
import com.foxclub.foxclub.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
  private FoxList foxList;
  private Logger logger;
  private FoxService sessionService;
  private int activeFoxIndex = 0;

  public MainController(FoxList foxList, Logger logger, FoxService foxService) {
    this.foxList = foxList;
    this.logger = logger;
    this.sessionService = sessionService;
    this.sessionService.setMainController(this);
  }

  @GetMapping("/")
  public String home(Model model) {
    model.addAttribute("activeFoxIndex", activeFoxIndex);
    if (activeFoxIndex == 0) {
      model.addAttribute("fox", new Fox());
      return "redirect:/login";
    }
    model.addAttribute("actionHistoryLogger", logger);
    model.addAttribute("fox", foxList.getFoxList().get(activeFoxIndex));
    return "index";
  }

  @PostMapping("/")
  public String home(Model model, @ModelAttribute Fox fox) {
    model.addAttribute("activeFoxIndex", activeFoxIndex);
    model.addAttribute("fox", fox);
    return "index";
  }

  @GetMapping("/login")
  public String login(Model model) {
    model.addAttribute("activeFoxIndex", activeFoxIndex);
    model.addAttribute("fox", new Fox());
    return "logger";
  }

  @PostMapping("/login")
  public String loggedIn(Model model, @ModelAttribute Fox fox) {
    if ((foxList.addFox(fox) && !fox.getName().isEmpty()) || foxList.checkFoxExists(fox.getName()) && !fox.getName().isEmpty()) {
    } else {
      model.addAttribute("activeFoxIndex", activeFoxIndex);
      return "redirect:/login";
    }
    sessionService.login(fox);
    logger.saveLoginAction();
    model.addAttribute("fox", fox);
    model.addAttribute("activeFoxIndex", activeFoxIndex);
    return "redirect:/";
  }

  @GetMapping("/nutritionstore")
  public String nutritionStore(Model model) {
    model.addAttribute("activeFoxIndex", activeFoxIndex);
    if (activeFoxIndex == 0) {
      model.addAttribute("fox", new Fox());
      return "redirect:/login";
    }
    return "nutritionstore";
  }

  @PostMapping("/nutritionsave")
  public String saveNutritions(Model model, @RequestParam("food") String food,
                               @RequestParam("drink") String drink) {
    String foodBefore = foxList.getFoxList().get(activeFoxIndex).getFood().getFoodName();
    String drinkBefore = foxList.getFoxList().get(activeFoxIndex).getDrink().getDrinkName();

    foxList.getFoxList().get(activeFoxIndex).getFood().setFoodName(food.toLowerCase());
    logger.saveNutritionChange(foxList.getFoxList().get(activeFoxIndex).getFood(), foodBefore, foxList.getFoxList().get(activeFoxIndex).getFood().getFoodName());
    foxList.getFoxList().get(activeFoxIndex).getDrink().setDrinkName(drink.toLowerCase());
    logger.saveNutritionChange(foxList.getFoxList().get(activeFoxIndex).getDrink(), drinkBefore, foxList.getFoxList().get(activeFoxIndex).getDrink().getDrinkName());

    model.addAttribute("activeFoxIndex", activeFoxIndex);
    model.addAttribute("fox", foxList.getFoxList().get(activeFoxIndex));
    return "redirect:/";
  }

  public void setActiveFoxIndex(int activeFoxIndex) {
    this.activeFoxIndex = activeFoxIndex;
  }

  public int getActiveFoxIndex() {
    return activeFoxIndex;
  }

  public void setFoxList(FoxList foxList) {
    this.foxList = foxList;
  }

  public FoxList getFoxList() {
    return foxList;
  }

  public void setLogger(Logger logger) {
    this.logger = logger;
  }

  public Logger getLogger() {
    return logger;
  }

  public void setSessionService(FoxService sessionService) {
    this.sessionService = sessionService;
  }

  public FoxService getSessionService() {
    return sessionService;
  }
}
