package com.simform.users.Service;

import com.simform.users.Entity.User;
import com.simform.users.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


  @Autowired
  private UserRepository userRepository;

  @Autowired
  private final PasswordEncoder passwordEncoder;


  public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
    this.userRepository = userRepository;
    this.passwordEncoder = passwordEncoder;
  }

  public void insertUser(User user){
    System.out.println("Start saving user into db");
    /**
     * encode the password using PassswordEncoder
     */
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    userRepository.save(user);
    System.out.println("saved user successfully into db");
  }

  public User userDetails(String email){
    return userRepository.findByEmail(email);
  }

  public List<User> findAllUser(){
    return userRepository.findAll();
  }

  public long countUser(){
    return userRepository.count();
  }

  public void deleteById(int id){
    userRepository.deleteById(id);
  }





}
