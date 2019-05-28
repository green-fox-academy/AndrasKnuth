package com.mysqlconnection.connect.repository;

import com.mysqlconnection.connect.models.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepo extends CrudRepository<Todo,Long> {
}
