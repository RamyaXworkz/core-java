package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.HospitalDto;

public interface HospitalRepo {
    public boolean validateAndAdd(HospitalDto dto);
}
