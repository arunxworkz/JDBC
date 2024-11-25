package com.xworkz.ryzex.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.ryzex.dto.RyzenEntity;

public class RyzenRunner {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ryzen");
		
//		EntityManager eManager = emf.createEntityManager();
//		EntityManager eManager2 = emf.createEntityManager();
//		EntityManager eManager3 = emf.createEntityManager();
		EntityManager eManager4 = emf.createEntityManager();
//		EntityManager eManager = emf.createEntityManager();
		
//		EntityTransaction et = eManager.getTransaction();
//		EntityTransaction et2 = eManager.getTransaction();
//		EntityTransaction et3 = eManager.getTransaction();
		EntityTransaction et4 = eManager4.getTransaction();
//		EntityTransaction et /= eManager.getTransaction();
		
		try {
	
//			RyzenEntity re = new RyzenEntity();
//			RyzenEntity re1 = new RyzenEntity();
//			RyzenEntity re2 = new RyzenEntity();
//			RyzenEntity re3 = new RyzenEntity();
//			RyzenEntity re4 = new RyzenEntity();
//			RyzenEntity re5 = new RyzenEntity();
//			RyzenEntity re6 = new RyzenEntity();
//			RyzenEntity re7 = new RyzenEntity();
//			RyzenEntity re8 = new RyzenEntity();
//			RyzenEntity re9 = new RyzenEntity();
//			RyzenEntity re10 = new RyzenEntity();
//			RyzenEntity re11 = new RyzenEntity();
			
//			et2.begin();
//			re2.setId(2);
//			re2.setRatings(4.5);
//			re2.setSeries(4000);
			
//			et3.begin();
//			re3.setId(3);
//			re3.setRatings(3.5);
//			re3.setSeries(3000);
////			
////			et4.begin();
////			re4.setId(4);
////			re4.setRatings(4);
////			re4.setSeries(2000);
//			
////			eManager2.persist(re2);
//			eManager3.persist(re3);
////			eManager4.persist(re4);
////			eManager.persist(re5);
//			
////			et2.commit();
//			et3.commit();
////			et4.commit();
			
			
	           et4.begin();
	            RyzenEntity re4 = new RyzenEntity();
	            re4.setId(4);
	            re4.setRatings(4.2);
	            re4.setSeries(2000);
	            eManager4.persist(re4);
	            et4.commit();  // Commit transaction for eManager4

		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
