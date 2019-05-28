package com.mysqlconnection.connect.controllers;

import com.mysqlconnection.connect.models.Todo;
import com.mysqlconnection.connect.services.TodoServiceImp;
import com.sun.org.apache.xpath.internal.operations.Mod;
import javafx.geometry.Pos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

  private TodoServiceImp todoServiceImp;

  public TodoController(TodoServiceImp todoServiceImp) {
    this.todoServiceImp = todoServiceImp;
  }

  @GetMapping("/todo")
  public String todo() {
    return "todo";
  }

  @GetMapping({"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", todoServiceImp.findAll());
    return "todolist";
  }

  @GetMapping("/addtodo")
  public String getTodo(Model model) {
    model.addAttribute("todos", todoServiceImp.findAll());
    return "addtodo";
  }

  @PostMapping("/addtodo")
  public String postTodo(Model model, String title) {
    todoServiceImp.save(new Todo(title));
    return "redirect:/";
  }

  @RequestMapping("/todo/{id}/delete")
  public String removeTodoById(Model model, @PathVariable("id") long id) {
    todoServiceImp.delete(id);
    model.addAttribute("todos", todoServiceImp.findAll());
    return "redirect:/list";
  }

  @GetMapping("/{id}/edit")
  public String editTodoById(Model model, @PathVariable("id") long id) {
    model.addAttribute("todo", todoServiceImp.findById(id));
    return "edit";
  }

  @PostMapping("/edit/{id}")
  public String editAndSaveTodo(@PathVariable long id, Todo todo) {
    Todo oldTodo = todoServiceImp.findById(id);
    oldTodo.setDone(todo.isDone());
    oldTodo.setTitle(todo.getTitle());
    oldTodo.setUrgent(todo.isUrgent());
    todoServiceImp.edit(oldTodo);
    return "redirect:/list";
  }
}

