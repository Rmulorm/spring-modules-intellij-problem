package com.example.application;

import com.example.service.SimpleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  @Bean
  public SimpleService getService() {
    return new SimpleService();
  }
}
