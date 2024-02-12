package com.xworkz.hospital;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

public class HospitalExecutor {
    public static void main(String[] args) {
        HospitalService service = new HospitalServiceImpl();

        HospitalDto dto = new HospitalDto(2,"Amar",9353213438L,"cold","O+ve");
       boolean result = service.validateAndAdd(dto);
//        System.out.println(result);
//        HospitalDto dto = service.findByName("Soumya");
//        System.out.println(dto);
//        boolean phNumber =  service.updatePhNumberByName("Soumya",6360792693L);
//        System.out.println(phNumber);
//        boolean deleted = service.deleteByName("Ramya");
//        System.out.println(deleted);
    }
}
