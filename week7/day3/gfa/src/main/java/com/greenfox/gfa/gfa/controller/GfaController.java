package com.greenfox.gfa.gfa.controller;

import com.greenfox.gfa.gfa.model.Student;
import com.greenfox.gfa.gfa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GfaController {
  @Autowired
  StudentService studentService;


  @GetMapping("/gfa")
  public String mainPage(){
    return "gfa";
  }

  @GetMapping("gfa/list")
  public String listStudents(Model model){
    model.addAttribute("names", studentService.findAll());
    return "list";
  }

  @GetMapping("gfa/add")
  public String addStudentForm() {
    return "add";
  }

  @GetMapping("gfa/add/save")
  public String addStudent(@RequestParam String name) {
    studentService.save(name);
    return "redirect:/gfa/list";
  }
}
