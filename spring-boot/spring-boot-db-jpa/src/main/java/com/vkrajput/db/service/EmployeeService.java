package com.vkrajput.db.service;

import com.vkrajput.db.data.EmployeeRepository;
import com.vkrajput.db.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public void addAEmployee(com.vkrajput.db.model.EmployeeDO employee) {
		employeeRepository.save(turnMetoEntity(employee));
	}


	public List<Employee> getEmployees() {
		return  employeeRepository.findAll();
	}

	public void addEmployess(List<com.vkrajput.db.model.EmployeeDO> employees) {
		for (Iterator<com.vkrajput.db.model.EmployeeDO> iterator = employees.iterator(); iterator.hasNext();) {
			com.vkrajput.db.model.EmployeeDO employee = iterator.next();
			addAEmployee(employee);
		}
	}

	private com.vkrajput.db.entity.Employee  turnMetoEntity(com.vkrajput.db.model.EmployeeDO employee) {
		com.vkrajput.db.entity.Employee employeeEntity = new com.vkrajput.db.entity.Employee ();
		employeeEntity.setAge(employee.getAge());
		employeeEntity.setFirstName(employee.getFirstName());
		employeeEntity.setLastName(employee.getLastName());
		return employeeEntity;
	}
}
