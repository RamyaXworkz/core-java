package com.xworkz.trainApp.repository;

import com.sun.xml.internal.ws.model.wsdl.WSDLOutputImpl;
import com.xworkz.trainApp.dto.TrainDto;

import javax.persistence.*;

public class TrainRepoImpl implements TrainRepo{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");

    EntityManager em = emf.createEntityManager();

    @Override
    public boolean validateAndSave(TrainDto dto) {

        System.out.println("Entered into Repo");

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
    public TrainDto findByTrainNoAndTrainName(int trainNo, String trainName) {

        try {
            Query query=   em.createNamedQuery("readByTrainNoAndTrainName",TrainDto.class);
            query.setParameter("no",trainNo);
            query.setParameter("nm",trainName);
            TrainDto dto= (TrainDto) query.getSingleResult();
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
    public TrainDto findByStartAndDest(String start, String dest) {
        try {
            Query query=   em.createNamedQuery("readByStartAndDest",TrainDto.class);
            query.setParameter("start",start);
            query.setParameter("dest",dest);
            System.out.println(start);
            System.out.println(dest);
            TrainDto dto = (TrainDto) query.getSingleResult();
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
    public boolean updateStartAndDestByTrainNo(String start, String dest, int trainNo) {
        EntityTransaction transaction= em.getTransaction();
        try {

            transaction.begin();
            System.out.println("transaction begins");
            Query query = em.createNamedQuery("updateStartAndDestByTraiNo");
            query.setParameter("start", start);
            query.setParameter("dest" ,dest);
            query.setParameter("no",trainNo);

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
    public boolean updateTimeByTrainName(String trainName, String time) {
        EntityTransaction transaction= em.getTransaction();
        try {

            transaction.begin();
            System.out.println("transaction begins");
            Query query = em.createNamedQuery("updateTimeByTrainName");
            query.setParameter("time", time);
            query.setParameter("nm" ,trainName);

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
    public boolean deleteByTrainNo(int trainNo) {
        EntityTransaction transaction = em.getTransaction();
        try{
            transaction.begin();
            System.out.println("transaction begins");
            Query query = em.createNamedQuery("deleteByTrainNo");
            query.setParameter("no",trainNo);
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
