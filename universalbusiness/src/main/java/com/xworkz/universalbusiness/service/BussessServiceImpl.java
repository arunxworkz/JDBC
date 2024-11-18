package com.xworkz.universalbusiness.service;

import com.xworkz.universalbusiness.dto.BusinessDTO;
import com.xworkz.universalbusiness.repository.BussnessRepoImpl;

public class BussessServiceImpl implements BusinessService{

	@Override
	public boolean save(BusinessDTO businessDTO) {
		
		boolean isValid = true;
		
		if(businessDTO != null) {

		
		if(!(businessDTO.getName().length() > 6 && businessDTO.getName().length() < 14)) {
			System.out.println("Name is incorrecnt");
			isValid = false;
		}
		
		if(!(businessDTO.getEmail().toUpperCase().contains("A") && businessDTO.getEmail().contains("@gmail.com") && 
				businessDTO.getEmail().length() == 8)) {
			System.out.println("Email is not valid");
			isValid = false;
		}
		
		if(!(businessDTO.getPhNo().length() == 10 && businessDTO.getPhNo().startsWith("9"))) {
			System.out.println("Phone number is not valid");
			isValid = false;
		}
		
		if (!(businessDTO.getAge() >= 18 && businessDTO.getAge() <= 65)) {
		    System.out.println("Age is invalid");
		    isValid = false;
		}

		}
		if(isValid) {
			BussnessRepoImpl bussnessRepoImpl = new BussnessRepoImpl();
			return bussnessRepoImpl.save(businessDTO);
		}else {
			return false;
		}

	}

}
