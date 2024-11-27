package com.xworkz.travelbooking.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.travelbooking.dto.FlightTickets;

public class FlightRunner {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.x-workz");
        EntityManager eM = emf.createEntityManager();
        EntityTransaction eT = eM.getTransaction();
        
        try {
            eT.begin();
            
            List<FlightTickets> li = new ArrayList<>();
            
            li.add(new FlightTickets("Arun", "Bengalurur", "AYODYA", 24000.00, 24));
            li.add(new FlightTickets("Pranav", "Bengalurur", "Kashi", 25000.00, 36));
            li.add(new FlightTickets("Pawan", "Benagaluru", "Shivmogga", 7000.00, 12));
            li.add(new FlightTickets("Kiran", "Delhi", "Mumbai", 15000.00, 48));
            li.add(new FlightTickets("Sneha", "Hyderabad", "Chennai", 13000.00, 30));
            li.add(new FlightTickets("Varun", "Kolkata", "Delhi", 22000.00, 18));
            li.add(new FlightTickets("Nisha", "Mumbai", "Goa", 8000.00, 10));
            li.add(new FlightTickets("Ravi", "Pune", "Nagpur", 9000.00, 15));
            li.add(new FlightTickets("Ananya", "Bengaluru", "Ahmedabad", 20000.00, 22));
            li.add(new FlightTickets("Rajesh", "Lucknow", "Patna", 14000.00, 27));
            li.add(new FlightTickets("Sahana", "Chandigarh", "Jaipur", 12000.00, 16));
            
           
            for (FlightTickets ticket : li) {
                eM.persist(ticket);
            }
            
            eT.commit();
            
        } catch (Exception e) {
            if (eT.isActive()) {
                eT.rollback(); 
            }
            e.printStackTrace();
        } finally {
            eM.close();
            emf.close();
        }

    }

}
