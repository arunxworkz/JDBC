package com.xworkz.healthcare.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.healthcare.entity.PatientDetails;


public class Query2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createNamedQuery("getAll");
		List<PatientDetails> li = (List<PatientDetails>)query.getResultList();
		for(PatientDetails pd: li) {
			System.out.println(pd);
		}
	}

}
