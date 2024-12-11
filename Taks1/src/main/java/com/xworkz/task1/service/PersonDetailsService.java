package com.xworkz.task1.service;

import java.util.List;

import com.xworkz.task1.entity.PersonDetailsEntity;

public interface PersonDetailsService {
	
	List<PersonDetailsEntity> getAll(int id);
	
	Object getEmailAndName(long phNo);
}
