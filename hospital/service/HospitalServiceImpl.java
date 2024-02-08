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

    @Override
    public HospitalDto findByName(String name) {
        if(!name.isEmpty() && name.length()>2){
            return repo.findByName(name);
        }
        return null;
    }

    @Override
    public boolean updatePhNumberByName(String name, long phNumber) {
        if (!name.isEmpty() && name.length()>2){
            System.out.println("name is valid");
            if (phNumber>= 10){
                System.out.println("Phone number is valid");
                return repo.updatePhNumberByName(name,phNumber);
            }
            System.out.println("phone number is invalid");
        }
        System.out.println("Check with the name");
        return false;
    }

    @Override
    public boolean deleteByName(String name) {
        if (!name.isEmpty() && name.length()>2){
            System.out.println("name is valid");
            return repo.deleteByName(name);
        }
        else {
            System.out.println("Sorry we can't help to delete");
        }
        return false;
    }
}
