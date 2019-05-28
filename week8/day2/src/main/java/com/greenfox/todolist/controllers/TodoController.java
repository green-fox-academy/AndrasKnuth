package com.greenfox.todolist.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {


  @GetMapping("/todo")
  public String todo(){
    return "todo";
  }

  @GetMapping({"/", "/list"})
  public String list(){
    return "This is my first Todo";
  }

}
