package com.xworkz.xworkz_admin_details.repository;

import com.xworkz.xworkz_admin_details.entity.XworkzEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class XworkzRepositoryImpl implements XworkzRepository{

    public XworkzRepositoryImpl(){
        System.out.println("This is repository implmenetation");
    }

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean saveRepo(XworkzEntity entity) {


        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try{

            entityTransaction.begin();
            entityManager.persist(entity);
            entityTransaction.commit();

        }catch(Exception e){
            if(entityTransaction.isActive())
                entityTransaction.rollback();
        }finally {
            entityManager.close();
            entityManagerFactory.close();
        }
        return true;
    }
}
