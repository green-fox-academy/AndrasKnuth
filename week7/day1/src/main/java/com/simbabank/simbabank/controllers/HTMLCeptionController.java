package com.simbabank.simbabank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HTMLCeptionController {

  @RequestMapping(path = "/html", method = RequestMethod.GET)
  public String htmlCeption(Model model) {
    model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmlCeption";
  }
}
