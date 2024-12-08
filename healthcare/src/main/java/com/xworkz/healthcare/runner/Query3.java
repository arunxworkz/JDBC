package com.xworkz.healthcare.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Query3 {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Query query = em.createNamedQuery("getById");
	query.setParameter("id", 6);
	
	List<Object[]> li = query.getResultList();
	for(Object[] obj:li) {
		System.out.println("Nmae: "+obj[0]+" "+"Email: "+obj[1]);
	}
	
}

}
