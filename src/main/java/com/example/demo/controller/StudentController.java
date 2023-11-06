package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping(path = "/student")
@CrossOrigin
public class StudentController {
	@Autowired
	StudentService studentservice;
	
	@GetMapping(path = "/all")
	public List<Student> getAllStudents(){
		return studentservice.getAllStudents();
	}
	
	@PostMapping(path = "/insert")
	public Student insertStudent(@RequestBody Student student) {
		return studentservice.insertStudent(student);
	}
	

}
