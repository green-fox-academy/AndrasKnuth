package com.jwt.demo.repositories;


import com.jwt.demo.modells.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

  ApplicationUser findByUsername(String username);
}