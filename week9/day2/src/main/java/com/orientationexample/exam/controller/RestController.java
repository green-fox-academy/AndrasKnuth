package com.orientationexample.exam.controller;
import com.orientationexample.exam.model.Entry;
import com.orientationexample.exam.services.EntryServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@ResponseBody
public class RestController {

  private final EntryServiceImp entryServiceImp;

  public RestController(EntryServiceImp entryServiceImp){
    this.entryServiceImp = entryServiceImp;
  }

  @GetMapping("/api/links")
  public List<Entry> getLinks(){
    return entryServiceImp.findAll();
  }
}
