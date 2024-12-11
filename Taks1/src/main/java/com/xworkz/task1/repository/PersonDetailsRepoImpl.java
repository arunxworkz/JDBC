package com.xworkz.task1.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.task1.entity.PersonDetailsEntity;
import com.xworkz.task1.service.PersonDetailsService;

public class PersonDetailsRepoImpl implements PersonDetailsRepo{
	
	
	public List<PersonDetailsEntity> getAll(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createNamedQuery("getById");
		query.setParameter("id", 0);
		List<PersonDetailsEntity> li = query.getResultList();
				
		
		return li;
	}

	@Override
	public Object getEmailAndName(long phNo) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query query = em.createNamedQuery("getNameandEmail");
		query.setParameter("phNo", phNo);
		
		Object[] obj = (Object[])query.getSingleResult();
		
		return obj;
	}	
}
