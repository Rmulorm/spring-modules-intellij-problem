package com.example.application;

import com.example.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SimpleController {

  private SimpleService service;

  @Autowired
  public SimpleController() {
    this.service = new SimpleService();
  }

  @GetMapping
  public String helloWorld() {
    return service.helloWorld();
  }

}
