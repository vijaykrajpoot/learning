package com.vkrajput.db.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vkrajput.db.rest.model.Employee;
import com.vkrajput.db.rest.persistence.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public Collection<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

}
