package com.example.controllers;

import com.example.proxy.DemoProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  private final DemoProxy demoProxy;

  public DemoController(DemoProxy demoProxy) {
    this.demoProxy = demoProxy;
  }

  @GetMapping("/demo")
  public String demo() {
    demoProxy.delay(5);
    return "<h1>Demo done.</h1>";
  }
}
