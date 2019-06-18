package com.vogella.retrofitgerrit;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@XmlRootElement(name = "item")
public class Article {

  @XmlElement(name = "title")
  private String title;

  @XmlElement(name = "link")
  private String link;
}
