package com.xworkz.healthcare.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.healthcare.entity.PatientDetails;

public class PatientDetailsRepoImpl implements PatientDetaillsRepo {

	@Override
	public boolean save(PatientDetails details) {

		System.out.println("this is repo==" + details.toString());

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();

		try {
			entityTransaction.begin();
			em.persist(details);
			entityTransaction.commit();
		} catch (Exception e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}finally {
			em.close();
			entityManagerFactory.close();
		}
		return false;
	}

	@Override
	public List<PatientDetails> getAll() {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();

		Query query = em.createNamedQuery("getAll");
		List<PatientDetails> details = query.getResultList();
		for (PatientDetails patientDetails : details) {
			System.out.println(patientDetails.getAge());
		}
		try {
			entityTransaction.begin();

			entityTransaction.commit();
		} catch (Exception e) {

		} finally {

		}

		return details;
	}

	@Override
	public String getNameById(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();
		String name = null;

		Query query = em.createNamedQuery("getNameById");
		query.setParameter("id", id);

		name = (String) query.getSingleResult();
		System.out.println(name);

		try {
			entityTransaction.begin();
			entityTransaction.commit();

		} catch (Exception e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}

		} finally {

		}

		return name;
	}

	@Override
	public LocalDateTime getDateAndtimeByPhno(Long phno) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();
		
		LocalDateTime time = null;
		
		try {
			
			Query query = em.createNamedQuery("getLocalDateByPhno");
			query.setParameter("phno", phno);
			time = (LocalDateTime)query.getSingleResult();
			System.out.println("Ths date time is: "+time);
			
		}catch(Exception e) {
			if(entityTransaction.isActive())
				entityTransaction.rollback();
		}finally {
			em.close();
			entityManagerFactory.close();
		}
		
		return time;
	}

	@Override
	public long getPhnoById(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();

		long phNo = 0;

		try {

			entityTransaction.begin();
			Query query = em.createNamedQuery("getPhnonumberById");
			query.setParameter("id", id);
			phNo = (long) query.getSingleResult();
			entityTransaction.commit();

		} catch (Exception e) {
			if (entityTransaction.isActive())
				entityTransaction.rollback();
			e.printStackTrace();
		} finally {
			em.close();
			entityManagerFactory.close();
		}
		return phNo;
	}

	@Override
	public boolean getSmokerByHeartRate(int heartRate) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();
		boolean smoker = false;
		
		try {
			
			Query query = em.createNamedQuery("getSmokerByHeartRate");
			query.setParameter("heart_rate", heartRate);
			
			smoker = (boolean)query.getSingleResult();

		}catch (Exception e) {
			if(entityTransaction.isActive())
				entityTransaction.rollback();
		}finally {
			em.close();
			entityManagerFactory.close();
		}
		return smoker;
	}

	@Override
	public Object getGenderAndName(int id) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");

		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = em.getTransaction();
		
		Object[] nameAndGender = null;
		
		try {
			
			Query query = em.createNamedQuery("getGender&NameById");
			query.setParameter("id", id);
			
			nameAndGender = (Object[])query.getSingleResult();
			
			
		}catch(Exception e) {
			if(entityTransaction.isActive())
				entityTransaction.rollback();
		}finally {
			em.close();
			entityManagerFactory.close();
		}
		
		return nameAndGender;
	}

	
	
}
