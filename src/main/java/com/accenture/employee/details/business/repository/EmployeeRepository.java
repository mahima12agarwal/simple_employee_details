package com.accenture.employee.details.business.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.accenture.employee.details.business.vo.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>{
	
		public Employee findByEmployeeId(Integer employeeId);
}
