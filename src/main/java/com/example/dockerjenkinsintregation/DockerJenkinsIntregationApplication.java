package com.example.dockerjenkinsintregation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinsIntregationApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "I am learning the jenkins-docker integration";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntregationApplication.class, args);
		System.out.println("Hello World");
	}

}
