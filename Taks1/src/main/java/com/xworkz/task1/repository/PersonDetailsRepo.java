package com.xworkz.task1.repository;

import java.util.List;

import com.xworkz.task1.entity.PersonDetailsEntity;

public interface PersonDetailsRepo {
	
	List<PersonDetailsEntity> getAll(int id); 

	Object getEmailAndName(long phNo);
}
