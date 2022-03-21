package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1")

public class TeacherController {
	
	
	@GetMapping(path="lists")
	public String getStudents() {
		
		List<String> list=Arrays.asList("Arun", "Khabib", "Conor");
		return list.toString();
	}

}
