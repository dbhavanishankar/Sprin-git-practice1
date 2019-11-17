package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping("/wish")
	public String wish() {
		String msg = "welcome to Spring boot with Git Example";
		/////////////ddddddddddddddjdnjdnf
		//anil
		//kumar
		//kumar3
		//kumar4
		//kumar4
			return msg;
		

	}
}
