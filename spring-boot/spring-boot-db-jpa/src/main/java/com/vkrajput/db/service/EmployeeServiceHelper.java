package com.vkrajput.db.service;

import com.vkrajput.db.entity.Employee;
import com.vkrajput.db.model.EmployeeDO;

public class EmployeeServiceHelper {

    /**
     *
     * Convert DO Object to Entity
     *
     * @param employee
     * @return
     */

    public static com.vkrajput.db.entity.Employee toEntity(com.vkrajput.db.model.EmployeeDO employee) {
        com.vkrajput.db.entity.Employee employeeEntity = new com.vkrajput.db.entity.Employee();
        employeeEntity.setAge(employee.getAge());
        employeeEntity.setFirstName(employee.getFirstName());
        employeeEntity.setLastName(employee.getLastName());
        return employeeEntity;
    }

    /**
     *
     * Convert entity Object to DO
     *
     * @param employee
     * @return
     */


    public static EmployeeDO toEmployeeDO(Employee employee) {
        EmployeeDO employeeDO = new EmployeeDO();
        employeeDO.setFirstName(employee.getFirstName());
        employeeDO.setLastName(employee.getLastName());
        employeeDO.setAge(employee.getAge());
        return employeeDO;
    }

}
