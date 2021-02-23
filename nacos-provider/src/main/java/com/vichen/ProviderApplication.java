package com.vichen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyu
 * @date 2021/2/8
 */
@SpringBootApplication
@RestController
@RequestMapping("provide")
@EnableDiscoveryClient
public class ProviderApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProviderApplication.class, args);
  }

  @GetMapping("hello")
  public String hello() {
    return "Hello Gateway!";
  }

}
