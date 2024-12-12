package com.xworkz.criminaldb.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.criminaldb")
@EnableWebMvc
public class Configure {

	public Configure() {
		System.out.println("This si WebInitilizer");
	}
	
}
