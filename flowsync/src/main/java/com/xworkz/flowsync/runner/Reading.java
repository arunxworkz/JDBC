package com.xworkz.flowsync.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.xworkz.flowsync.dto.FlowSyncDTO;

public class Reading {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		List<FlowSyncDTO> listOfAll = new ArrayList<FlowSyncDTO>();
		Query query1 = em.createNamedQuery("readAll");
		query1.getResultList().forEach(ref->System.out.println(ref));
		
		System.out.println("==================================================================");
		
		//Hard codded query
		Query query2 = em.createNamedQuery("getByRatings");
		Double accbal = (Double) query2.getSingleResult();
		System.out.println("The account balance is: "+accbal);

		System.out.println("==================================================================");
		
		//Here we need to use getResultList() as we need entire data
		Query query3 = em.createNamedQuery("getByBankName");
		query3.setParameter("bankname", "HDFC Bank");
		List<FlowSyncDTO> li = (List<FlowSyncDTO>)query3.getResultList();
		li.forEach(ref->System.out.println(ref));
		
		System.out.println("==================================================================");
		
		
		Query query4 = em.createNamedQuery("getByRating");
		query4.setParameter("ratings", (float)7.0);
		List<FlowSyncDTO> listOfBanks = (List<FlowSyncDTO>)query4.getResultList();
		listOfBanks.forEach(ref->System.out.println(ref));
		
		System.out.println("==================================================================");
		
		
		//When we are selectiong the multiple values we nedd to conver it into Object class
		Query query5 = em.createNamedQuery("getByName");
		Object[] result = (Object[])query5.getSingleResult();
		System.out.println("Name: "+result[0]+" "+"Balance: "+result[1]);
		
		
	}

}
