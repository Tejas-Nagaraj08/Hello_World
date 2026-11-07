package org.tejas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	@GetMapping("/")
	public String home() {
		return "Welcome to Tejas Spring Boot Application!";
	}
	

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from Spring Boot!";
    }

    @GetMapping("/status")
    public String status() {
        return "Application is running successfully!";
    }

}
