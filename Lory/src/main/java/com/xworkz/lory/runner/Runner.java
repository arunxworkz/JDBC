package com.xworkz.lory.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.lory.dto.vehicle;

public class Runner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
		
		EntityManager eM = emf.createEntityManager();
		
		EntityTransaction eT= eM.getTransaction();
		
		try {
			eT.begin();
			vehicle ve = new vehicle();
			
			ve.setId(23);
			ve.setMake("Tata");
			ve.setModel("2023");
			ve.setYear("2024");
			ve.setOwnername("Manu");
			ve.setVehiclecol("Merun");
			ve.setEnginetype("DTC");
			ve.setTrrasmission("Manul");
			ve.setFurltype("Petrol");
			ve.setMileage("35Km");
			
			eM.persist(ve);
			eT.commit();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			eM.close();
			emf.close();
		}
	}

}
