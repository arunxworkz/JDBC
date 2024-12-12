package com.xworkz.travleplaces.service;

import org.springframework.stereotype.Service;

import com.xworkz.travleplaces.dto.TravelPlacesDto;
import com.xworkz.travleplaces.enitity.TravelPlacesEnity;
import com.xworkz.travleplaces.repository.TravelPlacesRepo;
import com.xworkz.travleplaces.repository.TravelPlacesRepoImpl;

@Service
public class TravelPlaceServiceImpl implements TravelPlaceService {

//	@Autowired
//	private TravelPlacesRepo travelPlaceRepo;

	@Override
	public boolean save(TravelPlacesDto dto) {

		System.out.println("dto inservice==" + dto.toString());

		TravelPlacesEnity enity = new TravelPlacesEnity();
		enity.setPlaceName(dto.getPlaceName());
		enity.setPinCode(dto.getPinCode());
		//enity.setId(1);
		TravelPlacesRepo placesRepo =new TravelPlacesRepoImpl();
		placesRepo.save(enity);
		System.out.println("enity==" + enity.toString());
		
		return false;
	}

}
