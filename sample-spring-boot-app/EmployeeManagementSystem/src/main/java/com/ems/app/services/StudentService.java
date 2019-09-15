package com.ems.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.app.repository.StudentsRepository;
import com.ems.app.services.interfaces.IStudentService;
import com.ems.app.models.Student;


@Service
public class StudentService implements IStudentService {

	private StudentsRepository studentsRepository;

    @Autowired
    public StudentService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }
   
    @Override
    public List<Student> listAll() {
        return this.studentsRepository.findAll();
    }
   
    @Override
    public Student getById(int id) {
        return studentsRepository.findOne(id);
    }
}
