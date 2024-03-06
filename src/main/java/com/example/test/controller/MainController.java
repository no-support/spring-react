package com.example.test.controller;

import com.example.test.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MainController {

  @GetMapping("/api/hello")
  public String getMethodName() {
    return "hello";

  }

  @ResponseBody
  @GetMapping("/api/person")
  public Person json() {
    Person p = Person.builder().name("lee").age(30).build();
    return p;
  }

}
