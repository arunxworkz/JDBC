package com.xworkz.criminaldb.repository;

import com.xworkz.criminaldb.entity.CriminalEntity;
import org.dom4j.Entity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class CriminalRepoImpl implements CriminalRepository{
    @Override
    public boolean save(CriminalEntity entity) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try{

            entityTransaction.begin();
            entityManager.persist(entity);
            entityTransaction.commit();

        }catch(Exception e){
            if(entityTransaction.isActive())
                entityTransaction.rollback();

        }finally{
            entityManager.close();
            emf.close();
        }
        return true;
    }
}
