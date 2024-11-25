package com.xworkz.designercollections.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.designercollections.dto.AwscloudDTO;

public class AwsRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com-xworkz");
		EntityManager eM = emf.createEntityManager();
		EntityTransaction eT= eM.getTransaction();
		
		try {
			eT.begin();
			AwscloudDTO aws = new AwscloudDTO();
			aws.setId(1);
			aws.setServername("Tomcat");
			aws.setInstancetype("EC");
			aws.setOs("Linux");
			
			eM.merge(aws);
			eT.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			eM.close();
			emf.close();
		}
	}

}
