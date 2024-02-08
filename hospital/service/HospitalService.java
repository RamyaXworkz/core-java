package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.HospitalDto;

public interface HospitalService {
    public boolean validateAndAdd(HospitalDto dto);
    public HospitalDto findByName(String name);
    public boolean updatePhNumberByName(String name , long phNumber);
    public boolean deleteByName(String name);
}
