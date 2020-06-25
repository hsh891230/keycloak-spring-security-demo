package com.example.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("/")
  public String index() {
    // System.out.println(authentication);
    return "home";
  }

  @GetMapping("/test")
  public String test() {
    // System.out.println(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
    return "test";
  }
  
}