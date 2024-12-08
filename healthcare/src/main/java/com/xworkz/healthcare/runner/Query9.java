package com.xworkz.healthcare.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Query9 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			Query query = em.createNamedQuery("updateByName&Email");
			query.setParameter("name", "Charan");
			query.setParameter("phno", 7483079910l);
			query.setParameter("weight", 80.96f);
			float result = query.executeUpdate();
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (et.isActive())
				et.rollback();
			em.close();
			emf.close();
		}

	}

}
