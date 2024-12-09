package com.xworkz.healthcare.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.healthcare.entity.PatientDetails;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

public class Query10 {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();
		
		Query quey1 = em.createNamedQuery("getNameById");
		quey1.setParameter("id", 4);
		String str = (String)quey1.getSingleResult();
		System.out.println(str);
		
		Query query2 = em.createNamedQuery("getIdByName");
		query2.setParameter("patientname", "Osama");
		int id = (int)query2.getSingleResult();
		System.out.println(id);
		
		Query query3 = em.createNamedQuery("getBloodPressure");
		query3.setParameter("weight", 70.5f);
		Double bloodPressure = (Double)query3.getSingleResult();
		System.out.println(bloodPressure);
		
		Query query4 = em.createNamedQuery("getWeight");
		query4.setParameter("age", 29);
		Float weight = (Float)query4.getSingleResult();
		System.out.println(weight);
		
		Query query5 = em.createNamedQuery("getPhnonumberById");
		query5.setParameter("id", 10);
		long phno = (long)query5.getSingleResult();
		System.out.println(phno);
		
		Query query6 = em.createNamedQuery("getSmokerByHeartRate");
		query6.setParameter("heart_rate", 95);
		Boolean smokker = (Boolean)query6.getSingleResult();
		System.out.println(smokker);
		
		Query query7 = em.createNamedQuery("getDateTimeByphno");
		query7.setParameter("phno", 7483079911l);
		LocalDateTime dateTime = (LocalDateTime)query7.getSingleResult();
		System.out.println(dateTime);
		
		Query query8 = em.createNamedQuery("getGenderById&Name");
		query8.setParameter("id", 5);
		query8.setParameter("patientname", "Osama");
		char gender = (char)query8.getSingleResult();
		System.out.println(gender);
		
	}

}
