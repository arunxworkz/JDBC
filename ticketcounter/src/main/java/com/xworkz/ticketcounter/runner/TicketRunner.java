package com.xworkz.ticketcounter.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.ticketcounter.dto.TicketDTO;

public class TicketRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("x-workz");
		EntityManager eM = eMF.createEntityManager();
		
		EntityTransaction eT = eM.getTransaction();
		
		try {
			eT.begin();
			
			TicketDTO tD= new TicketDTO();
			tD.setId(1);
			tD.setNoofticket(2);
			tD.setMatchname("CSK V/S RCB");
			tD.setSeatnumber(2);
			
			eM.persist(tD);
			eT.commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			eM.close();
			eMF.close();
		}
	}

}
