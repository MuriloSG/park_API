package com.example.demoparkAPI.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity()
@Table(name="users")
public class User implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;
  @Column(name = "email", nullable = false, unique = true, length = 100)
  private String email;
  @Column(name = "password", unique = true, length = 200)
  private String password;
  @Enumerated(EnumType.STRING)
  @Column(name = "role", nullable = false, length = 25)
  private Role role;

  // Audit
  @Column(name = "created_at")
  private LocalDateTime created_at;
  @Column(name = "updated_at")
  private LocalDateTime updated_at;
  @Column(name = "created_by")
  private String created_by;
  @Column(name = "modified_by")
  private String modified_by;

  public enum Role{
    ROLE_ADMIN, ROLE_CLIENT
  }
}
