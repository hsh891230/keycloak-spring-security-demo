package com.example.springsecuritydemo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
  
  private String userId;

  private String userName;

}