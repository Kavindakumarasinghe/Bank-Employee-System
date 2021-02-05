package com.bank.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	
	@Column(name = "emp_name")
	private String employeeName;
	
	@Column(name = "emp_email")
	private String employeeEmail;
	
	@Column(name = "emp_photo")
	private String employeePhoto;
	
	@Column(name="emp_address")
	private String employeeAddress;
	
	@Column(name = "emp_password")
	private String employeePassword;
	
	@Column(name="branch_id")
	private int branchId;
	
	public Employee() {}
	
	public Employee(String employeeName, String employeeEmail, String employeePhoto, String employeeAddress,
			String employeePassword, int branchId) {
		super();
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeePhoto = employeePhoto;
		this.employeeAddress = employeeAddress;
		this.employeePassword = employeePassword;
		this.branchId = branchId;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeePhoto() {
		return employeePhoto;
	}

	public void setEmployeePhoto(String employeePhoto) {
		this.employeePhoto = employeePhoto;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}


}
