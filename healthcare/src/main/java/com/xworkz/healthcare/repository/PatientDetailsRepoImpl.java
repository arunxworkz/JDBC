package com.xworkz.healthcare.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.healthcare.entity.PatientDetails;

public class PatientDetailsRepoImpl implements PatientDetaillsRepo {

	@Override
	public boolean save(PatientDetails details) {

		System.out.println("this is repo==" + details.toString());

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();

		try {
			entityTransaction.begin();

			em.persist(details);
			entityTransaction.commit();

		} catch (Exception e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}

		} finally {
			em.close();
			entityManagerFactory.close();
		}

		return false;
	}

}
