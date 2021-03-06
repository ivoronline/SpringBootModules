package com.ivoronline.clientmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class ClientModuleApplication {

  public static void main(String[] args) throws URISyntaxException {
    SpringApplication.run(ClientModuleApplication.class, args);

    //CALL SERVER
    RestTemplate restTemplate = new RestTemplate();
    String       result       = restTemplate.getForObject(new URI("http://localhost:8080/Hello"), String.class);

    //RETURN SOMETHING
    System.out.println(result);

  }

}
