package com.greenfox.todolist.services;

import com.greenfox.todolist.models.Todo;

import java.util.List;

public interface ITodoService {
  List<Todo> findAll();
  Todo findById(long id);
  void save(Todo todo);
  void delete(long id);
}
