package com.xworkz.bankApp;

import com.xworkz.bankApp.dto.BankDto;
import com.xworkz.bankApp.service.BankServiceImpl;

import java.util.List;

public class BankExecutor {
    public static void main(String[] args) {
        BankServiceImpl service = new BankServiceImpl();
        BankDto dto =   new BankDto(1,"Ramya",9353213438L,"Savings","ramyagajili@gmail.com");
        BankDto dto1 =   new BankDto(2,"Spandana",4832389438L,"Savings","spandana@gmail.com");
        BankDto dto2 =   new BankDto(3,"Niveditha",43923723789L,"Savings","niveditha@gmail.com");
        BankDto dto3 =   new BankDto(4,"Chandana",9343655478L,"Savings","chandana@gamil.com");
        BankDto dto4 =   new BankDto(5,"Sahana",83649823647L,"Savings","sahana@gmail.com");
        service.validateAndSave(dto1);
        BankDto id = service.findById(2);
        System.out.println(id);

        BankDto name = service.findByName("Ramya");
        System.out.println(name);

        boolean updatedName = service.updateNameById( 5,"Niveditha");
        System.out.println(updatedName);

        boolean deleted = service.deleteByName("Spandana");
        System.out.println(deleted);

        List<BankDto> readData = service.readAll();
        for (BankDto dto5: readData){
            System.out.println(dto5);
        }
    }
}
