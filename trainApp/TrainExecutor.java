package com.xworkz.trainApp;

import com.xworkz.trainApp.dto.TrainDto;
import com.xworkz.trainApp.service.TrainService;
import com.xworkz.trainApp.service.TrainServiceImpl;

public class TrainExecutor {
    public static void main(String[] args) {
        TrainService service = new TrainServiceImpl();
        TrainDto dto = new TrainDto(3,"Sampark Kranti",12649,"Yashwantapur","H Nizamuddin","1:50PM",22);
        service.validateAndSave(dto);
//       TrainDto found = service.findByTrainNoAndTrainName(16592,"Hampi Express");
////        System.out.println(found);
//        TrainDto found1 = service.findByStartAndDest("Yashawantpur","Karatagi");
//        System.out.println(found1);
//        boolean updated = service.updateStartAndDestByTrainNo("Arsikere","Gangavthi",60246);
////        System.out.println(updated);
//        boolean update = service.updateTimeByTrainName("Hampi Express","8PM");
//        System.out.println(update);
//        boolean delete = service.deleteByTrainNo(12649);
//        System.out.println(delete);
    }
}
