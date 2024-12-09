package com.xworkz.healthcare.service;

import com.xworkz.healthcare.entity.PatientDetails;
import com.xworkz.healthcare.repository.PatientDetaillsRepo;
import com.xworkz.healthcare.repository.PatientDetailsRepoImpl;

public class PatientDetailsServiceImpl implements PatientService {

	@Override
	public boolean save(PatientDetails details) {
		System.out.println("details==" + details.toString());

		PatientDetaillsRepo detaillsRepo = new PatientDetailsRepoImpl();
		detaillsRepo.save(details);
		return false;
	}

}
