package com.xworkz.healthcare.runner;

import javax.persistence.*;

import com.xworkz.healthcare.entity.PatientDetails;

import java.util.*;

public class Query5 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createNamedQuery("getSingleAll");
		query.setParameter("id", 9);
		List<PatientDetails> str = (List<PatientDetails>)query.getResultList();
		str.forEach(ref->System.out.println(ref));
	}

}
