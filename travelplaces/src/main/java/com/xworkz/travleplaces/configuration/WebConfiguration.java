package com.xworkz.travleplaces.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz.travleplaces")
@EnableWebMvc
public class WebConfiguration {

	public WebConfiguration() {

	}

}
