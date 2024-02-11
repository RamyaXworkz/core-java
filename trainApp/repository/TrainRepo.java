package com.xworkz.trainApp.repository;

import com.xworkz.trainApp.dto.TrainDto;

public interface TrainRepo {
    public boolean validateAndSave(TrainDto dto);
    public TrainDto findByTrainNoAndTrainName(int trainNo ,String trainName);
    public  TrainDto findByStartAndDest(String start , String dest);
    public boolean updateStartAndDestByTrainNo(String start , String dest , int trainNo);
    public boolean updateTimeByTrainName(String trainName , String time);
    public boolean deleteByTrainNo(int trainNo);

}
