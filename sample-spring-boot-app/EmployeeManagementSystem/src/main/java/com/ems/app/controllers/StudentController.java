package com.ems.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.app.services.StudentService;
import com.ems.app.models.Student;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/students")
	public List<Student> index() {
		return this.studentService.listAll();
	}

	@RequestMapping("/students/{id}")
	public Student getProduct(@PathVariable String id) {
		return studentService.getById(Integer.parseInt(id));
	}
}
