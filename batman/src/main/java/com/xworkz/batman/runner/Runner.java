package com.xworkz.batman.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.batman.dto.BatManEntity;

public class Runner {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
	EntityManager eM = emf.createEntityManager();
	EntityTransaction et = eM.getTransaction();
	
	et.begin();
	BatManEntity bM = new BatManEntity();
	
	bM.setId(1);
	bM.setName("arun");
	bM.setEmail("arun@gmail.com");
	bM.setPhno("7483079907");
	
	eM.persist(bM);
	et.commit();
	
}
}
