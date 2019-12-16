package com.vkrajput.db;

import com.vkrajput.db.data.EmployeeRepository;
import com.vkrajput.db.entity.Employee;
import com.vkrajput.db.model.EmployeeDO;
import com.vkrajput.db.service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringDataApplication.class})
//@ActiveProfiles("test")
//@SpringBootApplication
public class EmployeeServiceTest {

    @Mock
    EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testSaveAEmployee() {
      //  Mockito.when(employeeRepository.save(Mockito.any())).thenReturn(Boolean.TRUE);
        EmployeeDO employee= Generator.generateEmployee();
        employeeService.addAEmployee(employee);
        List<Employee>  employees= employeeService.getEmployees();
        Assert.assertTrue(employees.size()>1);

    }


    @Test
    public void testEmployees() {
        List<EmployeeDO> employeeList= Generator.generateEmployees(10);
        employeeService.addEmployess (employeeList);
        List<Employee>  employees= employeeService.getEmployees();
        Assert.assertTrue(employees.size()>10);

    }



    @Test
    public void getAllEmployee(){
     List<Employee>  employees= employeeService.getEmployees();
        employees.forEach(employee -> System.out.println(employee));
    }


}
