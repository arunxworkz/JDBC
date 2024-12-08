package com.xworkz.healthcare.runner;

import javax.persistence.*;

import com.xworkz.healthcare.entity.PatientDetails;

import java.util.*;
public class Query6 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createNamedQuery("getAllbyName&Email");
		query.setParameter("name", "Naga");
		query.setParameter("email", "naga@gmail.com");
		
		List<PatientDetails> li = query.getResultList();
		li.forEach(ref->System.out.println(ref));
	}

}
