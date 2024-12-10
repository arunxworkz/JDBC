package com.xworkz.healthcare.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.healthcare.entity.PatientDetails;

public interface PatientDetaillsRepo {

	boolean save(PatientDetails details);

	List<PatientDetails> getAll();

	String getNameById(int id);

	LocalDateTime getDateAndtimeByPhno(Long phno);
	
	long getPhnoById(int id);

	boolean getSmokerByHeartRate(int heartRate);
	
	Object getGenderAndName(int id); 
	
}
