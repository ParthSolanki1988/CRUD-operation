package com.simform.users.Controller;

import com.simform.users.Entity.User;
import com.simform.users.Exception.UserNotfoundException;
import com.simform.users.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/v1/users")
@Slf4j
public class UserController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  @Autowired
  BCryptPasswordEncoder passwordEncoder;
  @Autowired
  private UserService userService;


  public UserController(UserService userService) {
    this.userService = userService;
  }

  //  @RequestMapping(value = "/register", method = RequestMethod.GET)
  @GetMapping("/register")
  public String showRegistrationForm() {
    logger.info("Register Page Open....");
    return "form";
  }

  @PostMapping("/updatelogin/{id}")
  public String afterUpdate(@ModelAttribute User user, @PathVariable int id) {
    Optional<User> byId = userService.findById(id);
    if (byId.isPresent()) {
      User existingUser = byId.get();
      if (user.getUserName() != null && !user.getUserName().equals("")) {
        existingUser.setUserName(user.getUserName());
      }
      if (user.getEmail() != null && !user.getEmail().equals("")) {
        existingUser.setEmail(user.getEmail());
      }
      if (user.getPassword() != null && !user.getPassword().equals("")) {
        existingUser.setPassword(passwordEncoder.encode(user.getPassword()));
      }
      userService.updateUser(existingUser);
    }

/*    logger.info("Welcome Page Open....");
    System.out.println(user.getId());
    userService.insertUser(user);*/
    return "redirect:/api/v1/users/login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String showLoginForm() {
    logger.info("Login Page Open....");
    return "login";
  }

  @RequestMapping(path = "/loginpage", method = RequestMethod.POST)
  public String registration(@ModelAttribute User user, ModelMap modelMap, @RequestParam("email") String email) {
    logger.info("Processing On Register Page....");
    userService.insertUser(user);
    System.out.println(user);
//    String message = "Form submitted successfully.";
//    modelMap.addAttribute("successMessage", message);
    logger.info("Form Submitted Successfully!");
    return "login";
  }


  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
    logger.info("Login Procsessing....");
    User user1 = userService.userDetails(email);
    if (user1 == null) {
      logger.warn("Login Failed null.....");
      throw new UserNotfoundException();
    }
    String existPassword = user1.getPassword();
//    System.out.println("Exist Password : " + existPassword);
    boolean passchecker = passwordEncoder.matches(password, existPassword);
//    System.out.println("At Login Time Password : " + passchecker);


    if (!user1.getEmail().equals(email)) {
      logger.warn("Login Failed using email.....");
      throw new UserNotfoundException();
    } else if (!passchecker) {
      logger.warn("Login Failed using Password.....");
      throw new UserNotfoundException();
    }
    logger.info("Login Successfully....");
    //count user
    long countUsers = userService.countUser();
    modelMap.addAttribute("usercount", countUsers);
    List<User> users = userService.findAllUser();
    modelMap.addAttribute("users", users);
    return "success";
  }

  @RequestMapping(path = "/updated/{id}")
  public String update(@PathVariable Integer id, ModelMap modelMap) {
    Optional<User> user = userService.findById(id);
    if (user.isPresent()) {
      modelMap.addAttribute("user", user.get());
    }
    return "update";


//    updatedUser.setId(id);
//    User updatedByIdUser = userService.updateUser(updatedUser);
//    logger.info("Update User Into Database");
//    //count user
//    long countUsers = userService.countUser();
//    modelMap.addAttribute("usercount" , countUsers);
//    // Update the model or retrieve the updated user list
//    List<User> users = userService.findAllUser();
//    modelMap.addAttribute("users", users);
////    return "success";
//    return updatedByIdUser;
  }


  @RequestMapping(path = "/deleted/{id}")
  public String deleteUser(@PathVariable int id, ModelMap modelMap) {
    userService.deleteById(id);
    logger.info("Deleted User From Database");
    //count user
    long countUsers = userService.countUser();
    modelMap.addAttribute("usercount", countUsers);
    // Update the model or retrieve the updated user list
    List<User> users = userService.findAllUser();
    modelMap.addAttribute("users", users);
    return "success";
  }


//  @RequestMapping(path = "/login", method = RequestMethod.POST)
//  public ResponseEntity<String> login(@RequestParam("email") String email , @RequestParam("password") String password, ModelMap modelMap) {
//    System.out.println("Login Procsessing....");
//    User user1 = userService.userDetails(email);
//    String existPassword = user1.getPassword();
//    System.out.println("Exist Password : " + existPassword);
//    boolean passchecker  = passwordEncoder.matches(password , existPassword);
//    System.out.println("At Login Time Password : " + passchecker);
//
//    if (!user1.getEmail().equals(email)){
//      System.out.println("Login Failed....");
//      throw new UserNotfoundException();
////      return "login";
//    }else if (!passchecker){
//      System.out.println("Login Failed.....");
//      throw new UserNotfoundException();
////      return "login";
//    }
//    System.out.println("Login Successfully....");
//    List<User> users = userService.findAllUser();
//
//    //count user
//    long countUsers = userService.countUser();
//    modelMap.addAttribute("usercount" , countUsers);
//
//    modelMap.addAttribute("users" , users);
//    return new ResponseEntity<>("success" , HttpStatus.OK);
////    return "success";
//  }


//  @RequestMapping(path = "/success")
//  public ModelAndView getAllUserFromDb(ModelMap modelMap){
//    System.out.println("Print all Users.........");
//
//
//    ModelAndView mv = new ModelAndView("success.jsp");
//    mv.addObject("users", users);
//    System.out.println(users);
//    return mv;
//  }

}


/*
 @RequestMapping(path = "/processed" , method = RequestMethod.POST)
  public String processOnForm(@RequestParam("email") String userEmail ,
                              @RequestParam("password") String userPassword ,
                              @RequestParam("userName") String userName ,
                              ModelMap modelMap){
    System.out.println("Processing form....");

    System.out.println("User Name : " + userName);
    System.out.println("User Email : " + userEmail);
    System.out.println("User Password : " + userPassword);


    get the data from the View  //get different - different data from view

    modelMap.addAttribute("email" , userEmail);
    modelMap.addAttribute("password" , userPassword);
    modelMap.addAttribute("userName" , userName);
 */

