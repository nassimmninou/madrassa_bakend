package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;


@Service
public class StudentService {
	@Autowired
	StudentRepository studentrepo;
	
	public List<Student> getAllStudents(){
		return studentrepo.findAll();
	}
	public Student insertStudent(Student student) {
		return studentrepo.save(student);
	}
	public void deleteStudent(Long id) {
		studentrepo.deleteById(id);
	}
	

}
