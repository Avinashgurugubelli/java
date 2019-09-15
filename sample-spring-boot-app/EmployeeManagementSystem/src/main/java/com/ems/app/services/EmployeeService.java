package com.ems.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ems.app.models.Employee;
import com.ems.app.models.Student;
import com.ems.app.repository.EmployeeRepository;
import com.ems.app.services.interfaces.IEmployeesService;

@Service
public class EmployeeService implements IEmployeesService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> listAll() {
		return this.employeeRepository.findAll();
	}

	@Override
    public Employee getById(Long id) {
        return employeeRepository.findOne(id);
    }
}
