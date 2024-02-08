package com.xworkz.hospital;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

public class HospitalExecutor {
    public static void main(String[] args) {
        HospitalService service = new HospitalServiceImpl();
        HospitalDto dto = new HospitalDto(2,"Ramya",9353614188L,"Dengue","O +ve");
       boolean result = service.validateAndAdd(dto);
        System.out.println(result);
    }
}
