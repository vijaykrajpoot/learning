package com.vkrajput.db.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkrajput.db.data.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public void addAEmployee(com.vkrajput.db.model.EmployeeDO employee) {
		employeeRepository.save(turnmetoEntity(employee));
	}

	public void addEmployess(List<com.vkrajput.db.model.EmployeeDO> employees) {
		for (Iterator<com.vkrajput.db.model.EmployeeDO> iterator = employees.iterator(); iterator.hasNext();) {
			com.vkrajput.db.model.EmployeeDO employee = iterator.next();
			addAEmployee(employee);
		}
	}

	private com.vkrajput.db.entity.Employee  turnmetoEntity(com.vkrajput.db.model.EmployeeDO employee) {

		com.vkrajput.db.entity.Employee employeeEntity = new com.vkrajput.db.entity.Employee ();
		employeeEntity.setAge(employee.getAge());
		employeeEntity.setFirstName(employee.getFirstName());
		employeeEntity.setLastName(employee.getLastName());
		return employeeEntity;
	}
}
