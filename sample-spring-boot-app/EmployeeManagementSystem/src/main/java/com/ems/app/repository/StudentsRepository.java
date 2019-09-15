package com.ems.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.app.models.Student;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Integer> {
}
