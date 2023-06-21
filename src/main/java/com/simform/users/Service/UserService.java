package com.simform.users.Service;

import com.simform.users.Entity.User;
import com.simform.users.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

//  INSERT

  public void insertUser(User user){
    System.out.println("Start saving user into db");
    /**
     * encode the password using PassswordEncoder
     */
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    userRepository.save(user);
    System.out.println("saved user successfully into db");
  }

//  READ

  public User userDetails(String email){
    return userRepository.findByEmail(email);
  }

  public List<User> findAllUser(){
    return userRepository.findAll();
  }

  public Optional<User> findById(Integer id){
    return userRepository.findById(id);
  }


//  COUNT

  public long countUser(){
    return userRepository.count();
  }


//  DELETE

  public void deleteById(int id){
    userRepository.deleteById(id);
  }


//  UPDATE
  public User updateUser(User user){
    return userRepository.save(user);
  }










}
