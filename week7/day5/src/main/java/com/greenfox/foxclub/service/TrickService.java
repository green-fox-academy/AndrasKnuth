package com.greenfox.foxclub.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrickService {
  ArrayList<String> tricks;

  public TrickService() {
    tricks = new ArrayList<>();
    tricks.add("sneaking around");
    tricks.add("telling lies");
    tricks.add("killing chicks");
    tricks.add("teaching about life");
  }

  public List<String> findAll() {
    return tricks;
  }
}
