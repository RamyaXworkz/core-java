package com.xworkz.bankApp.service;

import com.xworkz.bankApp.dto.BankDto;

import java.util.List;

public interface BankService {
    public boolean validateAndSave(BankDto dto);

    public BankDto findById(int id);

    public BankDto findByName(String name);

    public boolean updateNameById(int id , String name);

    public boolean deleteByName(String name);

    public List<BankDto> readAll();
}
