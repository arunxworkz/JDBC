package com.xworkz.healthcare.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.xworkz.healthcare.entity.PatientDetails;

public class Query4 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createNamedQuery("getCountByAge");
		
		query.setParameter("age", 15);
		Long age = (Long)query.getSingleResult();
		System.out.println("Age count is: "+age);
	}

}
