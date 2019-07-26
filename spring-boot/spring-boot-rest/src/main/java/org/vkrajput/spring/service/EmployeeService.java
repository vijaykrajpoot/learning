package org.vkrajput.spring.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vkrajput.spring.rest.model.Employee;
import org.vkrajput.spring.rest.persistence.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public Collection<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

}
