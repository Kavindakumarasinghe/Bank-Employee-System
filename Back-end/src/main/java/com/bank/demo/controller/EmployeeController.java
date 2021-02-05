package com.bank.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.demo.dto.EmployeeDTO;
import com.bank.demo.service.impl.EmployeeServiceImpl;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v1")

public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeService;
	
	//Get all employee details
	@GetMapping("/employees")
	public List<EmployeeDTO> gEmployeeDTOs(){
		
		return employeeService.getAllEmployees();
	}
}
