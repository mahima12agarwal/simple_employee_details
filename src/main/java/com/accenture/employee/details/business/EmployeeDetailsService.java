/**
 * 
 */
package com.accenture.employee.details.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.accenture.employee.details.business.vo.Employee;

/**
 * @author j.venugopalan
 *
 */
@SpringBootApplication
@Service
@Component
public class EmployeeDetailsService {
	
	@Autowired
	EmployeeDetailsAgrregator employeeDetailsAgrregator;
	
	/**
	 * 
	 * @param employeeId
	 * @return Employee Object
	 */
	public Employee getEmployeeDetails(Integer employeeId){
		Employee emp = new Employee();
		emp = employeeDetailsAgrregator.getEmployeeEntity(employeeId);
		return emp;
	}
	
}
