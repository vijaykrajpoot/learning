package com.vkrajput.db.rest.controller;

import java.util.Collection;

import com.vkrajput.db.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vkrajput.db.rest.model.Employee;


@RestController
@RequestMapping("employees")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public  Collection<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

}
