package com.springsecurity.springsecurityProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringSecurityProjectApplication {

	@GetMapping("/")
	public String index(){
		return "index";
	}
	@GetMapping("/admin/home")
	public String adminHome() {
		return "Admin home";
	}
	@GetMapping("/user/home")
	public String userHome(){
		return "User home";
	}
	@GetMapping("/home")
	public String homeForBoth()
	{
		return "both admin and user can access this";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityProjectApplication.class, args);
	}
}
