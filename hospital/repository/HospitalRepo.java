package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.HospitalDto;

public interface HospitalRepo {
    public boolean validateAndAdd(HospitalDto dto);

    HospitalDto findByName(String name);

    boolean updatePhNumberByName(String name, long phNumber);

    boolean deleteByName(String name);
}
