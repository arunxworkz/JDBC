package com.xworkz.wildlifedatabse.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.wildlifedatabse.dto.CookingDTO;


public class RecipieRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.workz");
		EntityManager eM= emf.createEntityManager();
		EntityTransaction eT= eM.getTransaction();
		
		try {
			eT.begin();
			
			CookingDTO dto = new CookingDTO("Chocolate Brownies", "Dessert", "40:00");
			
			//int id = dto.getId();
			eM.persist(dto);
			eT.commit();
			
			eT.begin();
			CookingDTO dto1 = eM.find(CookingDTO.class, dto.getId());
			eM.remove(dto1);
			eT.commit();

		}catch(Exception e) {
			if (eT.isActive()) {
				eT.rollback();
			}
			e.printStackTrace();
		}finally {
			eM.close();
			emf.close();
		}

	}

}
