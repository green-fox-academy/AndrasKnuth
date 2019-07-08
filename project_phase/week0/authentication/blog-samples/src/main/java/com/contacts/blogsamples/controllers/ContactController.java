package com.contacts.blogsamples.controllers;

import com.contacts.blogsamples.modells.Contact;
import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/contacts/")
public class ContactController {

  private static final List<Contact> contacts = Lists.newArrayList(
      //Contact.builder().name("Bruno Krebs").phone("+5551987654321").build(),
      //Contact.builder().name("John Doe").phone("+5551888884444").build()
      new Contact("Bruno Krebs", "+4949844444"),
      new Contact("John Doe", "+99861498441")
  );

  @GetMapping
  public List<Contact> getContacts() {
    return contacts;
  }

  @PostMapping
  public void addContact(@RequestBody Contact contact) {
    contacts.add(contact);
  }
}