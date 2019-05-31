package com.greenfox.redditpost.controllers;
import com.greenfox.redditpost.models.Post;
import com.greenfox.redditpost.services.PostServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
  PostServiceImp postServiceImp;

  public MainController(PostServiceImp postServiceImp){
    this.postServiceImp = postServiceImp;
  }

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("posts", postServiceImp.findAll());
    return "index";
  }

  @GetMapping("/submit")
  public String getTodo(Model model) {
    model.addAttribute("posts", postServiceImp.findAll());
    return "submit";
  }

  @PostMapping("/submit")
  public String postTodo(String title, String url) {
    postServiceImp.save(new Post(title, url));
    return "redirect:/";
  }

}
