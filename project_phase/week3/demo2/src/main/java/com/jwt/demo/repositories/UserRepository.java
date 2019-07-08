package com.jwt.demo.repositories;


import com.jwt.demo.modells.GitHubUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<GitHubUser, Long> {


}
