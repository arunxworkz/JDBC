package com.xworkz.healthcare.service;

import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.healthcare.entity.PatientDetails;

public interface PatientService {

	boolean save(PatientDetails details);

	boolean update();

	List<PatientDetails> getAll();
	String getNameById(int id);
	
	long getPhnoById(int id);
	
	LocalDateTime getDateAndtimeByPhno(Long phno);
	
	public boolean getSmokerByHeartRate(int heartRate);
	
	Object  getGenderAndName(int id);
}
