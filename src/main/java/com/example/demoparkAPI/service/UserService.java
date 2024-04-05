package com.example.demoparkAPI.service;

import com.example.demoparkAPI.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
  private final UserRepository userRepository;
}
