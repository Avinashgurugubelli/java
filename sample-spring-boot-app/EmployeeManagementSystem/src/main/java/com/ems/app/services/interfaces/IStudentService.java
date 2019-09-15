package com.ems.app.services.interfaces;

import java.util.List;

import com.ems.app.models.Student;

public interface IStudentService {
	List<Student> listAll();
	Student getById(int id);
}
