package com.simbabank.simbabank.controllers;
import com.simbabank.simbabank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {
  private List<BankAccount> bankAccounts = new ArrayList<>();

  public BankController(){
    bankAccounts.add(new BankAccount("Simba", 2000.00, "lion", "Zebra"));
    bankAccounts.add(new BankAccount("Scar", 4000.00, "lion", "Zebra"));
    bankAccounts.add(new BankAccount("Timon", 6000.00, "no idea", "Zebra"));
    bankAccounts.add(new BankAccount("Pumba", 8000.00, "boar", "Zebra"));
    bankAccounts.add(new BankAccount("Whoever", 12000.00, "liquid", "Zebra"));
  }


  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showBooks(Model model) {
    model.addAttribute("bankAccount", bankAccounts);
    return "show";
  }

}
