package com.bank.demo.dto;

import com.bank.demo.model.Bank;
import com.bank.demo.model.Branch;
import com.bank.demo.model.Employee;

public class EmployeeDTO {
	
	
	private int emp_id;
	private String employeeName;
	private String employeeEmail;
	private String employeePhoto;
	private String branchName;
	private String bankName;
	
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

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public EmployeeDTO(Employee employee,Branch branch, Bank bank) {
		
		this.emp_id = employee.getEmp_id();
		this.employeeName = employee.getEmployeeName();
		this.employeeEmail = employee.getEmployeeEmail();
		this.employeePhoto = employee.getEmployeePhoto();
		this.branchName = branch.getBranchName();
		this.bankName = bank.getBankName();
	}

		
}
