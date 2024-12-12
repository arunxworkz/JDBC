package com.xworkz.criminaldb.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.criminaldb.dto.CriminalDTO;
import com.xworkz.criminaldb.service.CriminalService;
import com.xworkz.criminaldb.service.CriminalServiceImpl;

@Controller
@RequestMapping("/")
public class CriminalController {

	
	public CriminalController() {
		System.out.println("This is Crminal controller constructor");
	}
	

	@RequestMapping("/getData")
	public String method(CriminalDTO dto) {
		
		CriminalService cs = new CriminalServiceImpl();
		boolean saved = cs.save(dto);
		System.out.println("This is saved from controller: "+saved);
		
		
		return "index.jsp";
		
	}
}
