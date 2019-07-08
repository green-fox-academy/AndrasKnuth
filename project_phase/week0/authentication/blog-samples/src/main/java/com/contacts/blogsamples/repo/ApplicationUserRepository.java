package com.contacts.blogsamples.repo;

import com.contacts.blogsamples.modells.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

  ApplicationUser findByUsername(String username);

}
