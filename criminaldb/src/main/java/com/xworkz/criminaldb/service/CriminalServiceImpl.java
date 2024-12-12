package com.xworkz.criminaldb.service;

import org.springframework.stereotype.Service;

import com.xworkz.criminaldb.dto.CriminalDTO;
import com.xworkz.criminaldb.entity.CriminalEntity;
import com.xworkz.criminaldb.repository.CriminalRepoImpl;
import com.xworkz.criminaldb.repository.CriminalRepository;

@Service
public class CriminalServiceImpl implements CriminalService{

	@Override
	public boolean save(CriminalDTO dto) {
		
		System.out.println("The edetails from service with dto: "+dto.toString());
		
		CriminalEntity centity = new CriminalEntity();
		centity.setCriminal_name(dto.getCiminal_name());
		centity.setCriminal_age(dto.getCriminal_age());
		centity.setSection_applied(dto.getSection());
		centity.setCriminal_hometown(dto.getCriminal_hometown());
		
		CriminalRepository crepo = new CriminalRepoImpl();
		crepo.save(centity);
		
		System.out.println("This is from service class with dto after invoking the method"
				+ "from the repository: "+centity.toString());
		
		return false;
	}

}
