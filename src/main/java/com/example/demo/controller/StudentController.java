package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	@GetMapping("/getTest")
	public String getTest() {
		return "hiii all i am gaurav";
	}

	/*
	 * @GetMapping(" /Student") public Student getStudentData() { Student stu = new
	 * Student(); stu.setId(2223); stu.setName("Gaurav"); stu.setCity("Pune");
	 * 
	 * return stu; }
	 */

}
