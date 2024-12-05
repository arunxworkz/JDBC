package com.xworkz.jpanamedquery.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.jpanamedquery.dto.ItemsDTO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


public class Runner {

	public static void main(String[] args) {
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("x-workz");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		try {
			List<ItemsDTO> list=new ArrayList<ItemsDTO>();
			list.add(new ItemsDTO("LAptop", 50000.0));
			list.add(new ItemsDTO( "TV", 60000.23));
			list.add(new ItemsDTO( "Fridge", 75000.00));
			list.add(new ItemsDTO( "Bike", 800000.23));
			list.add(new ItemsDTO( "Washng machine", 560000.0));
			list.add(new ItemsDTO( "Solar Heater", 30000.0));
			list.add(new ItemsDTO("Cycle pump", 200.0));
			
			for (ItemsDTO dto : list) {
				
			    eManager.persist(dto);
			}
			
			
				eTrans.begin();
				eTrans.commit();
				
			} catch (Exception e) {
				if(eTrans.isActive()) {
					eTrans.rollback();
				}
			}finally {
				eManager.close();
				emFactory.close();
			}

	}
}

		

	


