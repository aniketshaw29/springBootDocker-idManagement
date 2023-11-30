package com.example.idmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.idmanagement.service.IdService;

//@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/api/v1")
@RestController
public class IdController {
	
	@Autowired
	private IdService idService;

	@GetMapping("/")
	String landingPage() {
		return "Hello World!!!";
	}
	
	
}
