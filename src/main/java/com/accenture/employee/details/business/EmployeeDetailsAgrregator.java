/**
 * 
 */
package com.accenture.employee.details.business;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.employee.details.business.vo.Employee;

/**
 * @author j.venugopalan
 *
 */
@SpringBootApplication
public class EmployeeDetailsAgrregator {
	/**
	 * 
	 * @param id
	 * @return Employee
	 * Mock Employee object
	 */
	public Employee getEmployeeEntity(Integer id){
		Employee emp = new Employee();
		emp.setEmployeeId(id);
		emp.setEmployeeName("Victor Sam");
		emp.setEmployeeAdress("New Jersey, US");
		return emp;
	}


}
