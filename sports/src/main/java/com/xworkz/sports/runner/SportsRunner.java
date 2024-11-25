package com.xworkz.sports.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.sports.dto.SportsDto;

public class SportsRunner {

	public static void main(String[] args) {
		
		//Persisyence is an API
		
		//It is a factory class for creating EntityManager instances.
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("com.xworkz");

//		It is the primary interface for interacting with the database via entities.
//		It provides operations to query, insert, update, and delete entity objects.
//		CURD operations such as persist() - to save data in data base
//		merge() - insert and update operation
//		remove() - remove the data
//		find()
		
//		Controls the begining, commiting and rollback operations
		EntityManager em = eMF.createEntityManager();
		
		
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			SportsDto dto = new SportsDto();

			dto.setId(4);
			dto.setNoOfPlayers(7);
			dto.setSportsName("kabadi");

			em.merge(dto);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			eMF.close();
		}

	}

}
