package com.nxg.nxgecomm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	String hello() {
		return "Hello World";
	}
	
	@GetMapping("/hello2")
	String hello2() {
		return "Hello World 2";
	}
	
}
