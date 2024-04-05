package com.example.demoparkAPI.web.controller;

import com.example.demoparkAPI.entity.User;
import com.example.demoparkAPI.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/users")
public class UserController {
  private  final UserService userService;

  @PostMapping
  public ResponseEntity<User> create(@RequestBody User user){
    User createUser = userService.save(user);
    return ResponseEntity.status(HttpStatus.CREATED).body(createUser);
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getById(@PathVariable Long id){
    User userExist = userService.findById(id);
    return ResponseEntity.ok().body(userExist);
  }

  @PatchMapping("/{id}")
  public ResponseEntity<User> updatePassword(@PathVariable Long id, @RequestBody User user){
    User userUpdatePassword = userService.alterPassword(id, user.getPassword());
    return ResponseEntity.ok().body(userUpdatePassword);
  }

  @GetMapping
  public ResponseEntity<List<User>> getAll(){
    List<User> usersList = userService.findAllUsers();
    return ResponseEntity.ok(usersList);
  }
}
