package com.xworkz.task1.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.xworkz.task1.entity.PersonDetailsEntity;

public class Runner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			
			List<PersonDetailsEntity> li = new ArrayList<PersonDetailsEntity>();
			li.add(new PersonDetailsEntity(1, "Osama", 21, 7456321893l, 60.23, 5.6f, "osama@gmail.com", "A creative person with a creative mind"));
			li.add(new PersonDetailsEntity(2, "Chetahn", 22, 7412589632l, 70.23, 5.7f, "chetah@gmail.com", "Attractive, intelligent, confident, and exuding relaxed sophistication with a charming laid-back vibe."));
			li.add(new PersonDetailsEntity(3, "Charan", 22, 9632587412l, 72.32, 6.0f, "charan@gmail.com", "Knowledgeable person with valuable resources for information and advice."));
			li.add(new PersonDetailsEntity(4, "Shashank", 23, 8796541236l, 76.36, 6.0f, "shashank@gmail.com", "A Silent killer"));
			li.add(new PersonDetailsEntity(5, "Shamath", 22, 7896541236l, 55.23, 5.5f, "shamanth@gmail.com", "Someone bold, confident, and charismatic, with a commanding presence that inspires admiration and respect."));
			li.add(new PersonDetailsEntity(6, "Naga", 22, 4563217893l, 58.36, 5.5f, "nagraj@gmail.com", "Someone modest, respectful, and kind, who values others equally and carries themselves with genuine humility."));
			
	        for(PersonDetailsEntity pd: li) {
	        	em.persist(pd);
	        }
	        et.begin();
	        et.commit();
			
		}catch(Exception e) {
			if(et.isActive())
				et.rollback();
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}

	}

}
