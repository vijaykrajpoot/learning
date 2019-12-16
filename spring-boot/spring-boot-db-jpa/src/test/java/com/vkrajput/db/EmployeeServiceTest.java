package com.vkrajput.db;

import com.vkrajput.db.model.EmployeeDO;
import com.vkrajput.db.service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringDataApplication.class})
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testSaveAEmployee() {
        //  Mockito.when(employeeRepository.save(Mockito.any())).thenReturn(Boolean.TRUE);
        EmployeeDO employee = Generator.generateEmployee();
        employeeService.addAEmployee(employee);
        List<EmployeeDO> employees = employeeService.getEmployees();
        Assert.assertTrue(employees.size() > 1);
    }

    @Test
    public void testEmployees() {
        List<EmployeeDO> employeeList = Generator.generateEmployees(10);
        employeeService.addEmployess(employeeList);
        List<EmployeeDO> employees = employeeService.getEmployees();
        Assert.assertTrue(employees.size() >= 10);
    }
    

}
