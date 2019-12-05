package com.vkrajput.db;

import com.vkrajput.db.data.EmployeeRepository;
import com.vkrajput.db.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDbJpaApplicationTests {

	@Mock
	EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeService employeeService;

	@Test
	public  void testSaveAEmployee(){
	 employeeService.addAEmployee(Generator.generateEmployee());
	}
}
