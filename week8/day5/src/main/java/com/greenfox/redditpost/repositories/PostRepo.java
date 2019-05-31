package com.greenfox.redditpost.repositories;

import com.greenfox.redditpost.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {
}
