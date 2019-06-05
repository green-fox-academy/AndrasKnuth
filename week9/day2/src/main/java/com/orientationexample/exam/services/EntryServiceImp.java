package com.orientationexample.exam.services;

import com.orientationexample.exam.model.Entry;
import com.orientationexample.exam.repository.EntryRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class EntryServiceImp implements IEntryService {
  private EntryRepo entryRepo;

  public EntryServiceImp(EntryRepo entryRepo) {
    this.entryRepo = entryRepo;
  }

  @Override
  public List<Entry> findAll() {
    List<Entry> entries = new ArrayList<>();
    entryRepo.findAll().forEach(entry -> entries.add(entry));
    return entries;
  }

  @Override
  public Entry findById(long id) {
    return entryRepo.findById(id).orElse(null);
  }

  @Override
  public void save(Entry entry) {
    //kiszervezni
    Random rand = new Random();
    int l = 1000;
    int h = 10000;
    int result = rand.nextInt(h - l) + l;
    entry.setSecretCode(result);
    entryRepo.save(entry);
  }

  @Override
  public void delete(long id) {
    entryRepo.deleteById(id);
  }

  @Override
  public void edit(Entry entry) {
    entryRepo.save(entry);
  }

  @Override
  public Entry findAllByID(Long id) {
    return entryRepo.findAllById(id);
  }

  @Override
  public boolean checkIfAliasExists(String alias) {
    List<String> listAliases = findAll()
        .stream()
        .map(Entry::getAlias).collect(Collectors.toList());
    if (listAliases.contains(alias)) {
      return true;
    } else return false;
  }

@Override
  public Entry findByAlias(String alias) {
    List<Entry> entryList = new ArrayList<>();
    entryRepo.findAll().forEach(entryList::add);
    for (Entry a : entryList) {
      if (a.getAlias().equals(alias)) {
        return a;
      }
    }
    return null;
  }
}
