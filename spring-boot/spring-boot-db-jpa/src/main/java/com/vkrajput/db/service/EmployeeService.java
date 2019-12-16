package com.vkrajput.db.service;

import com.vkrajput.db.data.EmployeeRepository;
import com.vkrajput.db.entity.Employee;
import com.vkrajput.db.model.EmployeeDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public void addAEmployee(com.vkrajput.db.model.EmployeeDO employeeDO) {
		employeeRepository.save(EmployeeServiceHelper.toEntity(employeeDO));
	}


	public List<EmployeeDO> getEmployees() {

		List<EmployeeDO> listOfEmployeeDO=new LinkedList<>();
		List<Employee> employeeList=employeeRepository.findAll();
		employeeList.forEach(employee -> {
			listOfEmployeeDO.add(EmployeeServiceHelper.toEmployeeDO(employee));
			System.out.println("employee.getFirstName():"+employee.getFirstName());
		});
		return  listOfEmployeeDO;

	}

	public void addEmployess(List<com.vkrajput.db.model.EmployeeDO> employees) {
		for (Iterator<com.vkrajput.db.model.EmployeeDO> iterator = employees.iterator(); iterator.hasNext();) {
			com.vkrajput.db.model.EmployeeDO employee = iterator.next();
			addAEmployee(employee);
		}
	}


}
