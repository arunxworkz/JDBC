package com.xworkz.jpanamedquery.runner;

import java.util.List;

import javax.persistence.*;

import com.xworkz.jpanamedquery.dto.ItemsDTO;


public class reading {

	public static void main(String[] args) {

		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("x-workz");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		
		Query query=eManager.createNamedQuery("findAll");
//		List<ItemsDTO> listOfItems=query.getResultList();
//		Object object = query.getResultList();
		List<ItemsDTO> listOfItems = query.getResultList();
		

		for(ItemsDTO dto:listOfItems) {
			System.out.println(dto);
		}
		System.out.println("Value : "+listOfItems);
		System.out.println("--------------");
		
		
		Query query1=eManager.createNamedQuery("findById");
		Object obj = query1.getSingleResult();
		
		String dto = (String)obj;
		
		System.out.println("The data is: "+dto.toString());
		System.out.println("--------------");
		
		
		Query query2 =eManager.createNamedQuery("getData");
		query2.setParameter("id", 30);
		
		String dto1 = (String)query2.getSingleResult();
		System.out.println(dto1);

		
		System.out.println("--------------");
		
		
		//This is Soft coded
		Query query3 = eManager.createNamedQuery("findByIdByName");

		query3.setParameter("id", 29);
		query3.setParameter("name", "LAptop");
		
		Double price = (Double)query3.getSingleResult();
		System.out.println(price);
		
		System.out.println("--------------");
		
		//This is Hardcode
		
		Query query4 = eManager.createNamedQuery("findByIdByNameHardcoded");		
		Double price1 = (Double)query4.getSingleResult();
		System.out.println(price1);
		
		
	}



}
