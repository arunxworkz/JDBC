package com.xworkz.healthcare.runner;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.healthcare.entity.PatientDetails;
import com.xworkz.healthcare.service.PatientDetailsServiceImpl;
import com.xworkz.healthcare.service.PatientService;

public class QuerymainRunner {

	public static void main(String[] args) {
		PatientDetails details = new PatientDetails("rana", "rana@gmail.com", 78, 115.4, 72.0f, LocalDateTime.now(), 35,
				7483079910L, true);

		PatientService patientService = new PatientDetailsServiceImpl();
		patientService.save(details);

	}

}
