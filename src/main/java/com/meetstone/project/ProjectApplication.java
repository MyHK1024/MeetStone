package com.meetstone.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class })
public class ProjectApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
