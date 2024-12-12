package com.xworkz.travleplaces.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.xworkz.travleplaces.enitity.TravelPlacesEnity;

@Repository
public class TravelPlacesRepoImpl implements TravelPlacesRepo {

	@Override
	public boolean save(TravelPlacesEnity enity) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.persist(enity);
			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
		} finally {
			em.close();
			emf.close();
		}

		return true;
	}

}
