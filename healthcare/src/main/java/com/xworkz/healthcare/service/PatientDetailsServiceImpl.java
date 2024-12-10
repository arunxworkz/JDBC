package com.xworkz.healthcare.service;

import java.time.LocalDateTime;
import java.util.List;

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

	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<PatientDetails> getAll() {
		PatientDetaillsRepo detaillsRepo = new PatientDetailsRepoImpl();

		List<PatientDetails> list = detaillsRepo.getAll();

		return list;
	}

	@Override
	public String getNameById(int id) {
		PatientDetaillsRepo detaillsRepo = new PatientDetailsRepoImpl();
		String string = detaillsRepo.getNameById(id);
		return string;
	}

	@Override
	public long getPhnoById(int id) {
		PatientDetaillsRepo repo = new PatientDetailsRepoImpl();
		long phNo = repo.getPhnoById(id);
		System.out.println("This is phno from service: "+phNo);
		return phNo;
	}

	@Override
	public LocalDateTime getDateAndtimeByPhno(Long phno) {
		PatientDetaillsRepo repo = new PatientDetailsRepoImpl();
		LocalDateTime time = repo.getDateAndtimeByPhno(phno);
		return time;
	}

	@Override
	public boolean getSmokerByHeartRate(int heartRate) {
		PatientDetaillsRepo repo = new PatientDetailsRepoImpl();
		boolean smoke = repo.getSmokerByHeartRate(heartRate);
		return smoke;
	}

	@Override
	public Object getGenderAndName(int id) {
		PatientDetaillsRepo repo = new PatientDetailsRepoImpl();
		Object[] obj = (Object[]) repo.getGenderAndName(id);
		return obj;
	}

}
