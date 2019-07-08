package com.contacts.blogsamples.modells;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Contact {

  @Id
  public String name;
  public String phone;

  public Contact() {

  }

  public Contact(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }
}
