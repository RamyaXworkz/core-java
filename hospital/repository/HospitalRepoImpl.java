package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.HospitalDto;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;
import java.sql.ResultSet;
import java.util.Map;

public class HospitalRepoImpl implements HospitalRepo{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
    EntityManager em = emf.createEntityManager();

    @Override
    public boolean validateAndAdd(HospitalDto dto) {
        System.out.println("Entered into Repo");
        System.out.println("Created entity manager factory");
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

    @Override
    public HospitalDto findByName(String name) {

        try {
       Query query=   em.createNativeQuery("select * from HospitalDto where name = ?",HospitalDto.class);
       query.setParameter(1,name);
       HospitalDto dto= (HospitalDto) query.getSingleResult();
       return dto;
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            em.close();
            emf.close();
            System.out.println("Closed Resources");
        }
       return null;
    }

    @Override
    public boolean updatePhNumberByName(String name, long phNumber) {
        String updatedsQuery = "update HospitalDto set phNumber = ? where name = ?";
        EntityTransaction transaction= em.getTransaction();
        try {

            transaction.begin();
            System.out.println("transaction begins");
            Query query = em.createNativeQuery(updatedsQuery);
            query.setParameter(1, phNumber);
            query.setParameter(2 ,name);

            int rowsUpdated = query.executeUpdate();
            transaction.commit();
            System.out.println(rowsUpdated);
            if (rowsUpdated >0){
                return  true;
            }
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        finally {
            em.close();
            emf.close();
            System.out.println("Closed Resources");
        }

        return false;
    }

    @Override
    public boolean deleteByName(String name) {
     String deletedQuery = "delete from HospitalDto where name = ? ";
     EntityTransaction transaction = em.getTransaction();
     try{
       transaction.begin();
         System.out.println("transaction begins");
         Query query = em.createNativeQuery(deletedQuery);
         query.setParameter(1,name);
         int rowDeleted = query.executeUpdate();
         transaction.commit();
         if (rowDeleted >0){
             return  true;
         }
     }catch (Exception e){
         e.printStackTrace();
         transaction.rollback();
     }
     finally {
         em.close();
         emf.close();
         System.out.println("Closed Resources");
     }

        return false;
    }
}
