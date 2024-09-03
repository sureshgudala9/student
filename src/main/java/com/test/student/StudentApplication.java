package com.test.student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
public class StudentApplication {

	Logger logger = LoggerFactory.getLogger(StudentApplication.class);

	public void init()
	{
		logger.info("Application Started");
	}
	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

}
