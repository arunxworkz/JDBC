package com.xworkz.flowsync.runner;

import javax.persistence.Persistence;

import com.xworkz.flowsync.dto.FlowSyncDTO;


import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class Insertion {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {

			List<FlowSyncDTO> listDto = new ArrayList<FlowSyncDTO>();

			listDto.add(new FlowSyncDTO("Shashank", 400.2563, 5.5f, "Canara Bank"));
			listDto.add(new FlowSyncDTO("Shamanth", 123.89, 3.2f, "ICICI Bank"));
			listDto.add(new FlowSyncDTO("Charan", 1500.75, 10.5f, "HDFC Bank"));
			listDto.add(new FlowSyncDTO("Chethan", 220.30, 4.0f, "SBI Bank"));
			listDto.add(new FlowSyncDTO("Osama", 850.25, 7.8f, "Axis Bank"));
			listDto.add(new FlowSyncDTO("Amoga", 950.67, 6.9f, "Kotak Mahindra"));
			listDto.add(new FlowSyncDTO("Shashank", 400.2563, 5.5f, "Canara Bank")); // Duplicate of the first entry
			listDto.add(new FlowSyncDTO("Naga", 1100.55, 8.2f, "Bank of Baroda"));
			listDto.add(new FlowSyncDTO("Ajay", 650.50, 6.0f, "Union Bank"));
			listDto.add(new FlowSyncDTO("Deepak", 400.00, 5.2f, "Punjab National Bank"));
			listDto.add(new FlowSyncDTO("Sachine", 320.40, 4.7f, "Yes Bank"));
			listDto.add(new FlowSyncDTO("Abhishek", 520.235, 4.5f, "NO Bank"));

			et.begin();
			for (FlowSyncDTO dto : listDto) {
				em.persist(dto);
			}
			et.commit();
		} catch (Exception e) {
			if (et.isActive())
				et.rollback();
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}

	}

}
