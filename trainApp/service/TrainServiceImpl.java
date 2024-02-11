package com.xworkz.trainApp.service;

import com.xworkz.trainApp.dto.TrainDto;
import com.xworkz.trainApp.repository.TrainRepo;
import com.xworkz.trainApp.repository.TrainRepoImpl;

public class TrainServiceImpl implements TrainService {

    TrainRepo repo = new TrainRepoImpl();
    @Override
    public boolean validateAndSave(TrainDto dto) {
        if (dto.getTrainId()>0){
            System.out.println("Id is valid");
            if (!dto.getTrainName().isEmpty() && dto.getTrainName().length()>3 ){
                System.out.println("Train Number Valid.....");
                if (dto.getTrainNo() >5){
                    System.out.println("Train Number Valide.....");
                    if (!dto.getStart().isEmpty()){
                        if (!dto.getDest().isEmpty()){
                            System.out.println("Validated you can save your Train Details !!!!!1");
                            return repo.validateAndSave(dto);
                        }
                        else {
                            System.out.println("Please Provide the valid data to save your train details");
                        }
                    }
                }
                else{
                    System.out.println("Traim number not valid");
                }
            }
            else {
                System.out.println("Train Number is not Valid");
            }
        }
        else{
            System.out.println("Id not valide" +
                    "Your failig in First Step only");
        }
        return false;
    }

    @Override
    public TrainDto findByTrainNoAndTrainName(int trainNo, String trainName) {
        if (trainNo>5 && !trainName.isEmpty()){
            System.out.println("You may get the train details");
            return repo.findByTrainNoAndTrainName(trainNo,trainName);
        }else{
            System.out.println("Enetr the proper train details");
        }
        return null;
    }

    @Override
    public TrainDto findByStartAndDest(String start, String dest) {
        if (!start.isEmpty() && !dest.isEmpty()){
            System.out.println("You may get the Train Details");
            return repo.findByStartAndDest(start, dest);
        }
        else {
            System.out.println("Enetr the proper train details");
        }

        return null;
    }

    @Override
    public boolean updateStartAndDestByTrainNo(String start, String dest, int trainNo) {
        if(!start.isEmpty() && !dest.isEmpty()){
            if (trainNo >5){
                return repo.updateStartAndDestByTrainNo(start, dest, trainNo);
            }
        }
        return false;
    }

    @Override
    public boolean updateTimeByTrainName(String trainName, String time) {
        if (!trainName.isEmpty() && trainName.length()>3){
            if (!time.isEmpty()){
                return repo.updateTimeByTrainName(trainName, time);
            }
        }
        return false;
    }

    @Override
    public boolean deleteByTrainNo(int trainNo) {
        if (trainNo>5){
            return repo.deleteByTrainNo(trainNo);
        }
        return false;
    }
}
