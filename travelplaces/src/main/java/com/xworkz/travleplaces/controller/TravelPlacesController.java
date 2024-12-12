package com.xworkz.travleplaces.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.travleplaces.dto.TravelPlacesDto;
import com.xworkz.travleplaces.service.TravelPlaceService;
import com.xworkz.travleplaces.service.TravelPlaceServiceImpl;

@Controller
@RequestMapping("/")

public class TravelPlacesController {
	public TravelPlacesController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/save")

	public String onSave() {
		System.out.println("this is get ");
		return "index.jsp";
	}

	@PostMapping("/save")

	public String onSave(TravelPlacesDto dto) {
		System.out.println(dto.toString());
		TravelPlaceService placeService = new TravelPlaceServiceImpl();
		boolean saved = placeService.save(dto);

		return "index.jsp";
	}

}
