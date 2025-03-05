package com.hcl.datamanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class
})
public class DatamanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatamanagementApplication.class, args);
	}

}

/*
   I need software Setup such as jdk, Eclipse IDE, IntelliJ IDEA IDE, MySql, Postman, HeidiSQL for my Training.
   I'm requesting for Softwares through TARMAC but it is not working.
*/
