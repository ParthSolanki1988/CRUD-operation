package com.simform.users.Repository;

import com.simform.users.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User , Integer> {

  @Query("select u from User u where u.email= :email")
  public User findByEmail(@Param("email") String email);


}
