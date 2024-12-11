package com.xworkz.task1.runner;

import com.xworkz.task1.entity.PersonDetailsEntity;
import com.xworkz.task1.service.PersonDetailsService;
import com.xworkz.task1.service.PersonDetailsServiceImpl;

import java.util.List;

public class Fetching {

	public static void main(String[] args) {
		
		PersonDetailsService service = new PersonDetailsServiceImpl();
		List<PersonDetailsEntity> li = service.getAll(0);
		li.forEach(ref->System.out.println(ref));
		
		Object[] obj = (Object[]) service.getEmailAndName(4563217893l);
		System.out.println("Name: "+obj[0]+" "+"Email: "+obj[1]);
	}

}
