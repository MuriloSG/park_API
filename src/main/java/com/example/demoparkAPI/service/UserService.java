package com.example.demoparkAPI.service;

import com.example.demoparkAPI.entity.User;
import com.example.demoparkAPI.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
  private final UserRepository userRepository;

  @Transactional
  public User save(User user) {
    return userRepository.save(user);
  }
}
