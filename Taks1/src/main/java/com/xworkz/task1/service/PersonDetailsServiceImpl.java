package com.xworkz.task1.service;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

import com.xworkz.task1.entity.PersonDetailsEntity;
import com.xworkz.task1.repository.PersonDetailsRepo;
import com.xworkz.task1.repository.PersonDetailsRepoImpl;

public class PersonDetailsServiceImpl implements PersonDetailsService{

	PersonDetailsRepo repo = new PersonDetailsRepoImpl();
	@Override
	public List<PersonDetailsEntity> getAll(int id) {
		
		return repo.getAll(id);
		
	}
	@Override
	public Object getEmailAndName(long phNo) {
		
		return (Object[])repo.getEmailAndName(phNo);
	}

}
