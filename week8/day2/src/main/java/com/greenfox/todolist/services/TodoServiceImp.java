package com.greenfox.todolist.services;
import com.greenfox.todolist.models.Todo;
import com.greenfox.todolist.repository.TodoRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TodoServiceImp implements ITodoService{
  private TodoRepo todoRepo;

  public TodoServiceImp(TodoRepo todoRepo){
    this.todoRepo = todoRepo;
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    todoRepo.findAll().forEach(todo -> todoList.add(todo));
    return todoList;
  }

  @Override
  public Todo findById(long id) {
    return todoRepo.findById(id).orElse(null);
  }

  @Override
  public void save(Todo todo) {
    todoRepo.save(todo);
  }

  @Override
  public void delete(long id) {
    todoRepo.deleteById(id);
  }
}
