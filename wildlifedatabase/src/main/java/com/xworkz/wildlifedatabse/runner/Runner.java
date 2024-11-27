package com.xworkz.wildlifedatabse.runner;

import javax.persistence.Persistence;

import com.xworkz.wildlifedatabse.dto.WildLifeDTO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Runner {

	public static void main(String[] args) {
		
		EntityManagerFactory eMf=Persistence.createEntityManagerFactory("x-workz");
		EntityManager eM = eMf.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		
		
		try {
			eT.begin();
			WildLifeDTO dto = new WildLifeDTO();
//			dto.setId(8);
			
			//TO delete the data, first use the find()	method to 
			//check whether the data is present or not
			WildLifeDTO dto1 = eM.find(WildLifeDTO.class, 10);
			eM.remove(dto1); // remove() method will take  object entity
			eT.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			eM.close();
			eMf.close();
		}

	}

}
