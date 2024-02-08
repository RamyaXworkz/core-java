package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.repository.HospitalRepo;
import com.xworkz.hospital.repository.HospitalRepoImpl;

public class HospitalServiceImpl implements HospitalService{
    HospitalRepo repo = new HospitalRepoImpl();
    @Override
    public boolean validateAndAdd(HospitalDto dto) {
        if(dto.getId() >0){
            if (dto.getName()!=null && dto.getName().length()>3){
                if (dto.getProblem()!=null){
                    System.out.println("Patient can be added");
                   return repo.validateAndAdd(dto);
                }
                else {
                    System.out.println("Please provide patient name");
                }
            }
        }
        return false;
    }
}
