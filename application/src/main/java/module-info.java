module application {
  requires spring.web;
  requires spring.beans;
  requires spring.boot;
  requires spring.boot.autoconfigure;
  requires spring.context;

  requires service;

  exports com.example.application;
  opens com.example.application to spring.core;
}