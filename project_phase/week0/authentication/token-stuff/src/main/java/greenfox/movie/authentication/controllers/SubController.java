package greenfox.movie.authentication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubController {

  @GetMapping("/jwt-csrf-form")
  public String subTest() {
    return "testform";
  }
}
