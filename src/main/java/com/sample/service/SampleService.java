package com.sample.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SampleService {

  @Value("${SERVER_PORT}")
  private String serverPort;

  public String getServerPort() {
    return serverPort;
  }

}
