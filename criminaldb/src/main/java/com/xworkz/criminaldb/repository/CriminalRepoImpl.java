package com.xworkz.criminaldb.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.xworkz.criminaldb.entity.CriminalEntity;

@Repository
public class CriminalRepoImpl implements CriminalRepository{

	@Override
	public boolean save(CriminalEntity centity) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			
			et.begin();
			em.persist(centity);
			et.commit();
			
			
		}catch(Exception e) {
			if(et.isActive())
				et.rollback();
			e.printStackTrace();
		}finally{
			em.close();
			emf.close();
		}
		
		return true;
	}



}
