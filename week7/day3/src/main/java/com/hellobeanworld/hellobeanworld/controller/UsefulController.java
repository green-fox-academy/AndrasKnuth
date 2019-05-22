package com.hellobeanworld.hellobeanworld.controller;

import com.hellobeanworld.hellobeanworld.component.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulController extends UtilityService {
@Autowired
UtilityService utilityService;

  @RequestMapping(value = "/useful", method = RequestMethod.GET)
  public String useful(){
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String displayColoredPage(Model model) {
    model.addAttribute("backgroundColor", "background-color:" + utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String validateEmail(Model model, @RequestParam String email) {
    model.addAttribute("inspectedEmailAddress", utilityService.validateEmail(email));
    model.addAttribute("emailAddress", email);
    return "emailValidation";
  }

  @GetMapping("useful/code")
  public String caesarCoding(Model model, @RequestParam String code, @RequestParam int number){
    model.addAttribute("code", utilityService.caesar(code,number));
    return "code";
  }
}
