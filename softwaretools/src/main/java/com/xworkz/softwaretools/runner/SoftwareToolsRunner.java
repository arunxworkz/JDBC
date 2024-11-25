package com.xworkz.softwaretools.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.softwaretools.dto.SoftwareDTO;

public class SoftwareToolsRunner {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager eM = emf.createEntityManager();
		EntityTransaction eT = eM.getTransaction();

		try {
			eT.begin();
			SoftwareDTO so = new SoftwareDTO();
			so.setId(10);
			so.setName("Navik");
			so.setProvider("Indain Ministry of Defence");

			eM.persist(so);
			eT.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			eM.close();
			emf.close();
		}

	}

}
