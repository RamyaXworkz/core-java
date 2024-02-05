package com.xworkz.bankApp.service;

import com.xworkz.bankApp.dto.BankDto;
import com.xworkz.bankApp.repository.BankRepoImpl;

import java.util.List;

public class BankServiceImpl implements BankService{
    BankRepoImpl repo = new BankRepoImpl();
    @Override
    public boolean validateAndSave(BankDto dto) {
     if(dto.getId()>0){
         if (dto.getName() != null){
             System.out.println("Hurry!! Validated Continue to save");
             return repo.validateAndSave(dto);
         }
     }
        return false;
    }

    @Override
    public BankDto findById(int id) {
        if(id>0){
            System.out.println("id is valid get your bank Details");
            return repo.findById(id);
        }
        else {
            System.out.println("Id is invalid");
        }
        return null;
    }

    @Override
    public BankDto findByName(String name) {
        if(name.length()>2 && name!= null){
            System.out.println("You may get the application");
            return repo.findByName(name);
        }
        else{
            System.out.println("Check the name you have entered");
        }
        return null;
    }

    @Override
    public boolean updateNameById(int id, String name) {
        if(id>0){
            System.out.println("Name can be updateable");
            return repo.updateNameById(id, name);
        }
        return false;
    }

    @Override
    public boolean deleteByName(String name) {
         if (name != null){
             System.out.println("You can delete");
             return repo.deleteByName(name);
         }
        return false;
    }

    @Override
    public List<BankDto> readAll() {
        System.out.println("Reading all the data");
        return repo.readAll();
    }
}
