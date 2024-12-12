package com.xworkz.criminaldb.congiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.criminaldb")
public class CriminalConfiguration {

    public CriminalConfiguration(){
        System.out.println("This is configuration clases");
    }
}
