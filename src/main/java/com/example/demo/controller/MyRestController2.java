package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController2 {

	@GetMapping("/wish")
	public String wish() {
		String msg="hi welcome to RestController2";
		return msg;
	}

}
