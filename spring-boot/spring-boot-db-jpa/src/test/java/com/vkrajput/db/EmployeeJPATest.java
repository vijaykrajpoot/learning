package com.vkrajput.db;

import com.vkrajput.db.data.EmployeeRepository;
import com.vkrajput.db.model.EmployeeDO;
import com.vkrajput.db.service.EmployeeService;
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
public class EmployeeJPATest {

    @Mock
    EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testSaveAEmployee() {


        employeeService.addAEmployee(Generator.generateEmployee());
        List<EmployeeDO>  employees= employeeService.getEmployees();
        employees.forEach(employee -> System.out.println(employee));
    }

    @Test
    public void getAllEmployee(){
     List<EmployeeDO>  employees= employeeService.getEmployees();
        employees.forEach(employee -> System.out.println(employee));
    }


}
