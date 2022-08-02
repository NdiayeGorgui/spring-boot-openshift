package com.srv.springbootopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootOpenshiftApplication {
	
	@GetMapping("/test")
	public String openshift() {
		return "welcom to openshift";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOpenshiftApplication.class, args);
	}

}
