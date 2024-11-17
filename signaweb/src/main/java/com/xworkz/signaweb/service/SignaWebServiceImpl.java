package com.xworkz.signaweb.service;

import com.xworkz.signaweb.dto.SignaWebDTO;
import com.xworkz.signaweb.repository.SignaWebRepoImpl;

public class SignaWebServiceImpl implements SignawebService{

	@Override
	public boolean save(SignaWebDTO signaWebDTO) {
		
		boolean isvalid = true;	
		
		if(signaWebDTO == null) {
			isvalid = false;
		}
		if(signaWebDTO.getUserName().length() < 3 || signaWebDTO.getUserName().isEmpty()) {
			System.out.println("data is incorrect");
			isvalid = false;
		}
		
		if(!(signaWebDTO.getEmail().contains("@") && signaWebDTO.getEmail().endsWith(".com")||signaWebDTO.getEmail().endsWith(".in"))) {
			System.out.println("Dtat is incorrect");
			isvalid = false;
		}
		
		if(isvalid) {
			SignaWebRepoImpl signaWebRepoImpl = new SignaWebRepoImpl();
			return signaWebRepoImpl.save(signaWebDTO);
		}else {
			return false;
		}
		
	}

}
