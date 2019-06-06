package com.orientationexample.exam.controller;
import com.orientationexample.exam.model.Entry;
import com.orientationexample.exam.services.EntryServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
  private EntryServiceImp entryServiceImp;

  public MainController(EntryServiceImp entryServiceImp) {
    this.entryServiceImp = entryServiceImp;
  }

  @GetMapping("/")
  public String renderPage(Model model) {
    model.addAttribute("alias", new Entry("", ""));
    model.addAttribute("existingAlias", false);
    return "index";
  }

  @PostMapping("/save-link")
  public String addEntry(Model model, String url, String alias) {
    if (!entryServiceImp.checkIfAliasExists(alias)) {
      Entry entry = new Entry(url, alias);
      entryServiceImp.save(entry);
      model.addAttribute("alias", entry);
      model.addAttribute("existingAlias", false);
      return "index";
    }
    model.addAttribute("existingAlias", true);
    model.addAttribute("alias", new Entry(url, alias));
    return "index";
  }

  @GetMapping("/a/{alias}")
  public Object goToUrl(@PathVariable(value = "alias") String alias) {
    Entry usedEntry = entryServiceImp.findByAlias(alias);
    if (usedEntry != null) {
      usedEntry.incrementHitCount();
      entryServiceImp.save(usedEntry);
      return "redirect:" + usedEntry.getUrl();
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
}