package com.xworkz.jpanamedquery.runner;

import javax.persistence.*;

import com.xworkz.jpanamedquery.dto.ItemsDTO;


public class reading {

	public static void main(String[] args) {

		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("items");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		
		Query query=eManager.createNamedQuery("findById");
		Object obj=query.getSingleResult();
		
		ItemsDTO entity=(ItemsDTO) obj;
		System.out.println("Value : "+entity.toString());
		System.out.println("--------------");
	}

}
