package com.orientationexample.exam.services;

import com.orientationexample.exam.model.Entry;

import java.util.List;

public interface IEntryService {
  List<Entry> findAll();
  Entry findById(long id);
  void save(Entry entry);
  void delete(long id);
  void edit(Entry entry);
  Entry findAllByID(Long id);
  boolean checkIfAliasExists(String name);
  Entry findByAlias(String alias);
}
