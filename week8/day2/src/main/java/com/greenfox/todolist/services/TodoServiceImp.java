package com.greenfox.todolist.services;

import com.greenfox.todolist.models.Todo;
import com.greenfox.todolist.repository.TodoRepo;

import java.util.ArrayList;
import java.util.List;

public class TodoServiceImp implements ITodoService{
  private TodoRepo TodoRepo;

  public TodoServiceImp(TodoRepo TodoRepo){
    this.TodoRepo = TodoRepo;
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    TodoRepo.findAll().forEach(todo -> todoList.add(todo));
    return todoList;
  }

  @Override
  public Todo findById(long id) {
    return TodoRepo.findById(id).orElse(null);
  }

  @Override
  public void save(Todo todo) {
    TodoRepo.save(todo);
  }

  @Override
  public void delete(long id) {
    TodoRepo.deleteById(id);
  }
}
