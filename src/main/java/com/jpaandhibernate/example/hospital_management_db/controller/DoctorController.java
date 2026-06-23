package com.jpaandhibernate.example.hospital_management_db.controller;

import com.jpaandhibernate.example.hospital_management_db.model.Doctor;
import com.jpaandhibernate.example.hospital_management_db.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor/apis")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    //spring boot application - takes input in the form of JSON(javascript object notation)

    // @RequestBody - it is used to take input request from UI or postman and it is used for only complete class inputs

    @PostMapping("/save")
    public String saveDoctor(@RequestBody Doctor doctor){
        String response = doctorService.saveDoctor(doctor);
        return response;
    }
}
