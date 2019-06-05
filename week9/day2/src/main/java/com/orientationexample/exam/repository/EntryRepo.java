package com.orientationexample.exam.repository;
import com.orientationexample.exam.model.Entry;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface EntryRepo extends CrudRepository<Entry, Long> {
  List<Entry> findAll();

  Entry findAllById(Long id);
}
