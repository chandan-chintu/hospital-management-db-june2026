package com.jpaandhibernate.example.hospital_management_db.service;

import com.jpaandhibernate.example.hospital_management_db.model.Doctor;
import com.jpaandhibernate.example.hospital_management_db.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // it contains the business logic
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public String saveDoctor(Doctor doctor){
        doctorRepository.save(doctor);
        return "Doctor saved successfully!!!";
    }
}
