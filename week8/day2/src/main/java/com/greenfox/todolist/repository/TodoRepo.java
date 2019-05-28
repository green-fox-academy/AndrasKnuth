package com.greenfox.todolist.repository;

import com.greenfox.todolist.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo,Long> {
}
