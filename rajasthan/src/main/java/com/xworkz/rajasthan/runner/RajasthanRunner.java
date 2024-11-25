package com.xworkz.rajasthan.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.rajasthan.dto.RajastahnEntity;

public class RajasthanRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rajasthan");
		EntityManager eM= emf.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		
		eT.begin();
		RajastahnEntity rt = new RajastahnEntity();
		rt.setId(21);
		rt.setProducttablename("Sun Glasses");
		rt.setProducttabletype("Specs");
		
		eM.persist(rt);
		eT.commit();
		

	}

}
