/**
 * 
 */
package com.accenture.employee.details.business.vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author j.venugopalan
 *
 */


@Document
public class Employee {
	
	@Id
	private long id;
	private Integer employeeId;
	private String employeeName;
	private String employeeAddress;
	
	
	public Employee(Integer employeeId) {
		super();
		this.employeeId = employeeId;
	}

	public Employee(Integer employeeId, String employeeName, String employeeAdress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAdress;
	}
	public Employee() {
		super();
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAdress() {
		return employeeAddress;
	}
	public void setEmployeeAdress(String employeeAdress) {
		this.employeeAddress = employeeAdress;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAdress="
				+ employeeAddress + "]";
	}
	
	

}
