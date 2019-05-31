package com.greenfox.redditpost.services;

import com.greenfox.redditpost.models.Post;
import com.greenfox.redditpost.repositories.PostRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImp implements PostServiceInterface{
  private PostRepo postRepo;

  public PostServiceImp(PostRepo postRepo){
    this.postRepo = postRepo;
  }

  @Override
  public List<Post> findAll() {
    List<Post> posts = new ArrayList<>();
    postRepo.findAll().forEach(post -> posts.add(post));
    return posts;
  }

  @Override
  public void save(Post post) {
    postRepo.save(post);
  }
}
