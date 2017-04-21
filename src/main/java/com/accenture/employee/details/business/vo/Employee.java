/**
 * 
 */
package com.accenture.employee.details.business.vo;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author j.venugopalan
 *
 */


@Document
public class Employee {
	
	@Id
	private BigInteger id;
	private Integer employeeId;
	private String employeeName;
	private String employeeAddress;
	
	
	public Employee(Integer employeeId) {
		super();
		this.employeeId = employeeId;
	}

	public Employee(Integer employeeId, String employeeName, String employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
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
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + "]";
	}
	
	

}
