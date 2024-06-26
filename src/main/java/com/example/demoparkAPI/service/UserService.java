package com.example.demoparkAPI.service;

import com.example.demoparkAPI.entity.User;
import com.example.demoparkAPI.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
  private final UserRepository userRepository;

  @Transactional
  public User save(User user) {
    return userRepository.save(user);
  }

  @Transactional(readOnly = true)
  public User findById(Long id) {
    return userRepository.findById(id).orElseThrow(
            () -> new RuntimeException("User not found.")
    );
  }

  @Transactional
  public User alterPassword(Long id, String password) {
    User user = findById(id);
    user.setPassword(password);
    return user;
  }

  public List<User> findAllUsers() {
    List<User> listUsers = userRepository.findAll();
    return listUsers;
  }
}