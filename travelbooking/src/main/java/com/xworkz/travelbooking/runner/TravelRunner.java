package com.xworkz.travelbooking.runner;

import javax.persistence.EntityManagerFactory;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.travelbooking.dto.TravelDTO;

public class TravelRunner {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");

		EntityManager eM = emf.createEntityManager();

		EntityTransaction eT = eM.getTransaction();

		try {
			eT.begin();

			List<TravelDTO> li = new ArrayList<TravelDTO>();

			li.add(new TravelDTO("John Doe", "john.doe@mail.com", "Paris", "2024-12-01", "2024-12-10", "2500.00",
					"bookingstatus"));
			li.add(new TravelDTO("Sarah Smith", "sarah.smith@mail.com", "Tokyo", "2024-12-15", "2024-12-25", "3000.00",
					"Pending"));
			li.add(new TravelDTO("Michael Brown", "michael.b@mail.com", "New York", "2025-01-05", "2025-01-12",
					"2000.00", "Confirmed"));
			li.add(new TravelDTO("Emily Davis", "emily.d@mail.com", "London", "2024-12-20", "2024-12-30", "2800.00",
					"Confirmed"));
			li.add(new TravelDTO("David Wilson", "david.w@mail.com", "Sydney", "2025-01-10", "2025-01-20", "4000.00",
					"Cancelled"));
			li.add(new TravelDTO("Laura Johnson", "laura.j@mail.com", "Dubai", "2024-12-25", "2025-01-01", "1500.00",
					"Confirmed"));
			li.add(new TravelDTO("Chris Martin", "chris.m@mail.com", "Rome", "2025-01-15", "2025-01-25", "2700.00",
					"Pending"));
			li.add(new TravelDTO("Jessica Taylor", "jessica.t@mail.com", "Cape Town", "2025-02-01", "2025-02-10",
					"3500.00", "Confirmed"));
			li.add(new TravelDTO("Daniel White", "daniel.w@mail.com", "Berlin", "2024-12-15", "2024-12-22", "2200.00",
					"Confirmed"));
			li.add(new TravelDTO("Sophia Moore", "sophia.m@mail.com", "Bangkok", "2025-01-25", "2025-02-02", "1800.00",
					"Pending"));
			
			for(TravelDTO dto: li) {
				eM.persist(dto);
			}
			
			
			eT.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			eM.close();
			emf.close();
		}

	}

}
