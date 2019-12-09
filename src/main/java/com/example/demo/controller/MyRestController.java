package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping("/wish")
	public String wish() {
		String msg = "welcome to Spring boot with Git Examples bhavani latest1234567";
		return msg;
		
	}
	@GetMapping("/wish1")
	public String wish1() {
		String msg = "welcome to Spring boot with Git Examples bhavani latest1234567";
		return msg;
		

	}
	@GetMapping("/wish2")
	public String wish2() {
		String msg = "welcome to Spring boot with Git Examples bhavani latest1234567";
		return msg;
		

	}
}
