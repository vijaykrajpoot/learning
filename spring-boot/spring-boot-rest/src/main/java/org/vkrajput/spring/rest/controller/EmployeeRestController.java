package org.vkrajput.spring.rest.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vkrajput.spring.rest.model.Employee;
import org.vkrajput.spring.service.EmployeeService;


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
