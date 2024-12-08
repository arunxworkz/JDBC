package com.xworkz.healthcare.runner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.healthcare.entity.PatientDetails;

public class Query1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			
			List<PatientDetails> li = new ArrayList<PatientDetails>();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	        li.add(new PatientDetails("Arun", "arun@gmail.com", 99, 80.36, 59.63f, LocalDateTime.parse("07-03-2024 17:30:50", formatter), 26, 7483079907L, false));
	        li.add(new PatientDetails("Shashank", "shashank@gmail.com", 85, 120.5, 70.5f, LocalDateTime.parse("08-03-2024 10:15:20", formatter), 30, 7483079908L, true));
	        li.add(new PatientDetails("Shamanth", "shamanth@gmail.com", 95, 110.75, 60.8f, LocalDateTime.parse("09-03-2024 14:45:55", formatter), 28, 7483079909L, false));
	        li.add(new PatientDetails("Charan", "charan@gmail.com", 78, 115.4, 72.0f, LocalDateTime.parse("10-03-2024 09:30:10", formatter), 35, 7483079910L, true));
	        li.add(new PatientDetails("Osama", "osama@gmail.com", 88, 130.3, 65.2f, LocalDateTime.parse("11-03-2024 13:05:40", formatter), 32, 7483079911L, false));
	        li.add(new PatientDetails("Chetahan", "chetha@gmail.com", 92, 125.0, 75.1f, LocalDateTime.parse("12-03-2024 08:20:30", formatter), 27, 7483079912L, true));
	        li.add(new PatientDetails("Amoga", "amoga@gmail.com", 90, 100.2, 68.5f, LocalDateTime.parse("13-03-2024 18:00:00", formatter), 29, 7483079913L, false));
	        li.add(new PatientDetails("Naga", "naga@gmail.com", 80, 135.7, 66.3f, LocalDateTime.parse("14-03-2024 11:40:25", formatter), 33, 7483079914L, true));
	        li.add(new PatientDetails("Deepak", "deepak@gmail.com", 86, 140.2, 63.4f, LocalDateTime.parse("15-03-2024 07:50:35", formatter), 31, 7483079915L, false));
	        
	        for(PatientDetails pd: li) {
	        	em.persist(pd);
	        }
	        et.begin();
	        et.commit();
	        
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(et.isActive())
				et.rollback();
			em.close();
			emf.close();
		}
	}

}
