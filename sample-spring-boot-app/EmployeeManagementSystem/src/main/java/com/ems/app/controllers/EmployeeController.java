package com.ems.app.controllers;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.app.mappers.EmployeeMapper;
import com.ems.app.models.Employee;
import com.ems.app.models.EmployeeDTO;
import com.ems.app.services.EmployeeService;

@RestController
public class EmployeeController {

	private EmployeeMapper empMapper = Mappers.getMapper(EmployeeMapper.class);
	@Autowired
	private EmployeeService employeeService;


	@RequestMapping("/employees")
	public List<EmployeeDTO> getAllEmployees() {
		List<Employee> empList = employeeService.listAll();
		return empMapper.toEmployeetDTOs(empList);
	}
}
