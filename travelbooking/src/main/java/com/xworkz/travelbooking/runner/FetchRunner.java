package com.xworkz.travelbooking.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.travelbooking.dto.FlightTickets;

public class FetchRunner {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.x-workz");
		EntityManager eM = emf.createEntityManager();
		EntityTransaction eT = eM.getTransaction();

		Integer id = 1;

		FlightTickets dto = eM.find(FlightTickets.class, id);

		System.out.println("The data is: " + dto.getName()+" "+dto.getSource()+" "+
		dto.getDestination()+ " "+dto.getPrice()+" "+dto.getPrice()+" "+dto.getSeatNo());

		/*
		 * The above line will provide erroe if we have not provided the default
		 * construtor. The error No default constructor for entity indicates that the
		 * FlightTickets class is missing a no-argument constructor. Hibernate (or JPA)
		 * requires a no-argument constructor for entities because it uses reflection to
		 * instantiate objects during database operations.
		 */
		
		try {
			eT.begin();
			eT.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (eT.isActive()) {
				eT.rollback();
			}
		} finally {
			eM.close();
			emf.close();
		}

	}

}
