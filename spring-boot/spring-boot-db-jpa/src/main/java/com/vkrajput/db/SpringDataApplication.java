package com.vkrajput.db;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vkrajput.db.service.EmployeeService;

@SpringBootApplication
public class SpringDataApplication implements ApplicationRunner {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(SpringDataApplication.class);

	@Autowired
	private EmployeeService employeeService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("Your application started with option names : {}", args.getOptionNames());
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringDataApplication.class, args);
	}

}
