package com.xworkz.healthcare.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Query8 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			Query query = em.createNamedQuery("update");
			query.setParameter("email", "chetha@gmail.com");
			query.setParameter("phno", 7483079912l);
			query.setParameter("is_smoker", false);
			int reuslt = query.executeUpdate();
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
