package com.mysqlconnection.connect.services;

import com.mysqlconnection.connect.models.Todo;

import java.util.List;

public interface ITodoService {
  List<Todo> findAll();
  Todo findById(long id);
  void save(Todo todo);
  void delete(long id);
  void edit(Todo todo);
}
