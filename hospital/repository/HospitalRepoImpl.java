package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.HospitalDto;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;
import java.util.Map;

public class HospitalRepoImpl implements HospitalRepo{
    @Override
    public boolean validateAndAdd(HospitalDto dto) {
        System.out.println("Entered into Repo");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
        System.out.println("Created entity manager factory");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
       try{
           System.out.println("Transaction begins");
           transaction.begin();
           em.persist(dto);
           transaction.commit();
       }catch (Exception e){
           e.printStackTrace();
           transaction.rollback();
           return false;
       }
       finally {
           em.close();
           emf.close();
           System.out.println("Closed Resources");
       }

        return true;
    }
}
