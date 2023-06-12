package com.simform.users.Exception;

import com.simform.users.Entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionController {
  @ExceptionHandler(value = UserNotfoundException.class)
  public ResponseEntity<String> exception(UserNotfoundException userNotfoundException){
    return new ResponseEntity<>("User Not Found" , HttpStatus.NOT_FOUND);
  }
}
