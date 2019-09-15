package com.ems.app.mappers;

import java.util.List;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.MappingTarget;

import com.ems.app.models.Employee;
import com.ems.app.models.EmployeeDTO;



@Mapper
public interface EmployeeMapper {

//	EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

	@Mappings({ 
		@Mapping(target = "employeeId", source = "entity.id"),
		@Mapping(target = "employeeName", ignore = true)
		})
	EmployeeDTO employeeToEmployeeDTO(Employee entity);

	@Mappings({ @Mapping(target = "id", source = "dto.employeeId") })
	Employee employeeDTOtoEmployee(EmployeeDTO dto);

	List<EmployeeDTO> toEmployeetDTOs(List<Employee> employees);
	
	@AfterMapping
    default void setEmployeeName(@MappingTarget EmployeeDTO empDTO, Employee employee) {
		String employeeFirstName = employee.getFirstName();
		String employeeLastName = employee.getLastName();
		empDTO.employeeName = employeeFirstName + "." + employeeLastName;
    }

}
