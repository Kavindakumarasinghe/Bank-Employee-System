package com.bank.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.demo.dto.EmployeeDTO;
import com.bank.demo.model.Bank;
import com.bank.demo.model.Branch;
import com.bank.demo.model.Employee;
import com.bank.demo.repository.BankRepository;
import com.bank.demo.repository.BranchRepository;
import com.bank.demo.repository.EmployeeRepository;
import com.bank.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private BankRepository bankRepository;
	
	List<Branch> branch;
	List<Bank> banks;
	
	@Autowired
	private BranchRepository branchRepository;
	
	@Override
	public List<EmployeeDTO> getAllEmployees() {
		
		//get all employees to list
		List<Employee> employeeList = employeeRepository.findAll();
		
		 this.banks = bankRepository.findAll();
		 this.branch = branchRepository.findAll();
		
		 //Create new DTO list
		 List<EmployeeDTO> employeeDTOs = new ArrayList<>();
		
		 //Iterate through employee list
		 for(int i =0; i<employeeList.size(); i++)
		 {
			 //Get branch from employee
			 Branch branch = getBranch(employeeList.get(i));
			 Bank bank = getBank(branch);
			 EmployeeDTO employeeDTO = new EmployeeDTO(employeeList.get(i), branch, bank);
			 
			 employeeDTOs.add(employeeDTO);
		}
 
		return employeeDTOs;
	}
	
	//find the matching branch for relevant branch_id from employee
	
	private Branch getBranch(Employee emp) {
		int branchId = emp.getBranchId();
		for(int i=0; i<branch.size(); i++)
		{
			if(branch.get(i).getBranchId() == branchId)
			{
				return branch.get(i);
			}
		}
		return null;
	}
	
	
	//find the matching bank for relevant bank_id from branch
	private Bank getBank(Branch branch)
	{
		long bankId = branch.getBankId();
		for(int i =0; i<banks.size(); i++)
		{
			if(banks.get(i).getBankId() == bankId)
			{
				return banks.get(i);
			}
		
		}
		return null;
	}

}
