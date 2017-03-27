package com.accenture.employee.details.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.employee.details.business.EmployeeDetailsService;
import com.accenture.employee.details.business.vo.Employee;

@RestController
@SpringBootApplication
public class EmployeDetailsController {
	@Autowired
	EmployeeDetailsService employeeDetailsService;
	
	@RequestMapping(value="/employees/{employeeId}")
	public Employee getEmployeeDetails(@PathVariable ("employeeId") Integer employeeId){
		Employee emp = new Employee();
		emp = employeeDetailsService.getEmployeeDetails(employeeId);
		return emp;
	}

}
