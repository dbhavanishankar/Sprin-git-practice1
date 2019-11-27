package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController2 {

	@GetMapping("/wish")
	public String wish() {
		String msg = "hi welcome to the RestController2";
		// cooment 1
		// cooment 2
		// cooment 3
		// cooment 4
		// cooment 5
		return msg;
	}

}
