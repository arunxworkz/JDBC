package com.xworkz.designercollections.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.designercollections.dto.ClothingDTO;

public class ColthesRunner {
	public static void main(String[] args) {
		
		EntityManagerFactory eMf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager eM = eMf.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		try {
eT.begin();
ClothingDTO dto =new ClothingDTO();
dto.setId(5);
dto.setName("Cotton zeens pant");
dto.setPhno("7896547893");
dto.setAmmount(1500);

eM.persist(dto);
eT.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			eM.close();
			eMf.close();
		}
	}
}
