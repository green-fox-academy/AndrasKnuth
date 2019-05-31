package com.greenfox.redditpost.services;
import com.greenfox.redditpost.models.Post;
import java.util.List;

public interface PostServiceInterface {
  List<Post> findAll();
  void save(Post post);
}