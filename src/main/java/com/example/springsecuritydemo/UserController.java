package com.example.springsecuritydemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @GetMapping("test")
  public String test() {
    return "user test";
  }

  @GetMapping
  public List<User> list() {
    return Arrays.asList(User.builder().userId("user-1").userName("user-1-name").build(),
        User.builder().userId("user-2").userName("user-2-name").build());
  }

}