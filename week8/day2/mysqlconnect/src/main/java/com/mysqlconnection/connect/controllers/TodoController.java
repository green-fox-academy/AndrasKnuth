package com.mysqlconnection.connect.controllers;

import com.mysqlconnection.connect.services.TodoServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  private TodoServiceImp todoServiceImp;

  public TodoController(TodoServiceImp todoServiceImp){
    this.todoServiceImp = todoServiceImp;
  }

  @GetMapping("/todo")
  public String todo(){
    return "todo";
  }

  @GetMapping({"/", "/list"})
  public String list(Model model){
    model.addAttribute("todos", todoServiceImp.findAll());
    return "todolist";
  }
}

