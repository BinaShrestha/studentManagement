package com.itntraining.studentmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itntraining.studentmanagement.entities.Department;

//@RestController
@Controller
public class DefaultController {
@GetMapping({"/home","/"})
public String getHomePage() {
	return "home";
	
}
@GetMapping("/department")
public String getDepartmentPage() {
	return "department";
}
@GetMapping("/about")
public String getAboutPage() {
	return "about";
}
@GetMapping("/student")
public String getStudentPage() {
	return "student";
}
	}
	


