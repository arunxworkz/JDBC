package com.xworkz.jpanamedquery.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.jpanamedquery.dto.ItemsDTO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


public class Runner {

	public static void main(String[] args) {
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("items");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		
			List<ItemsDTO> list=new ArrayList<ItemsDTO>();
			list.add(new ItemsDTO(1,"LAptop", 50000.0));
			list.add(new ItemsDTO(2, "TV", 60000.23));
			list.add(new ItemsDTO(3, "Fridge", 75000.00));
			list.add(new ItemsDTO(4, "Bike", 800000.23));
			list.add(new ItemsDTO(5, "Washng machine", 560000.0));
			list.add(new ItemsDTO(6, "Solar Heater", 30000.0));
			list.add(new ItemsDTO(7,"Cycle pump", 200.0));
			
			for (ItemsDTO dto : list) {
				
			    eManager.persist(dto);
			}
			
			try {
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

		

	


