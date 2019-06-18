package com.vogella.retrofitgerrit;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;
import retrofit2.http.Path;

@Getter
@Setter
@XmlRootElement(name = "rss")
public class RSSFeed {
  @XmlElement (name="title")
  @Path("channel")
  private String channelTitle;

  @XmlElements(name="item", inline=true)
  @Path("channel")
  private List<Article> articleList;
}
