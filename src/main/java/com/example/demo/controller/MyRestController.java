package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping("/wish")
	public String wish() {
		String msg = "welcome to Spring boot with Git Examples bhavani latest1234";
		return msg;
		

	}
}
