package com.xworkz.healthcare.runner;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.healthcare.entity.PatientDetails;
import com.xworkz.healthcare.service.PatientDetailsServiceImpl;
import com.xworkz.healthcare.service.PatientService;

public class QuerymainRunner {

	public static void main(String[] args) {

		PatientService patientService = new PatientDetailsServiceImpl();

		String str = patientService.getNameById(7);

		System.out.println("string name ==" + str);
		
		System.out.println("------------------------------------------");
		
		long phNumber = patientService.getPhnoById(5);
		System.out.println("This is from  main runner :"+phNumber);
		
		System.out.println("------------------------------------------");
		
		LocalDateTime time = patientService.getDateAndtimeByPhno(7483079911l);
		System.out.println("The date time is: "+time);
		
		System.out.println("------------------------------------------");
		
		boolean smoke = patientService.getSmokerByHeartRate(88);
		System.out.println("HE smokes: "+smoke);
		
		System.out.println("------------------------------------------");
		
		Object[] obj = (Object[]) patientService.getGenderAndName(8);
		System.out.println("Gender and name is: "+obj.toString());
	}

}
