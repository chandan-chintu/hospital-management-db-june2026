package com.jpaandhibernate.example.hospital_management_db.controller;

import com.jpaandhibernate.example.hospital_management_db.model.Doctor;
import com.jpaandhibernate.example.hospital_management_db.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor/apis")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    // debugging - tracing the flow of the application(understanding line by line what is happening and all)

    //spring boot application - takes input in the form of JSON(javascript object notation)

    // @RequestBody - it is used to take input request from UI or postman and it is used for only complete class inputs

    @PostMapping("/save")
    public String saveDoctor(@RequestBody Doctor doctor){
        String response = doctorService.saveDoctor(doctor);
        return response;
    }

    //@PathVariable - it is used to take the inputs in input request url path
    @GetMapping("/findById/{id}")
    public Doctor findDoctorById(@PathVariable int id){
        Doctor doctor = doctorService.findByDoctorId(id);
        return doctor;
    }

    @GetMapping("/findAll")
    public List<Doctor> findAllDoctors(){
        List<Doctor> doctorList = doctorService.findAllDoctors();
        return doctorList;
    }

    @GetMapping("/count")
    public String countDoctors(){
        String response = doctorService.countDoctors();
        return response;
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteDoctorById(@PathVariable int id){
        String response = doctorService.deleteById(id);
        return response;
    }

    @PutMapping("/updatePut/{id}")
    public String updateDoctorUsingPut(@PathVariable int id, @RequestBody Doctor newDoctorRequest){
        String response = doctorService.updateDoctorUsingPut(id, newDoctorRequest);
        return response;
    }

    // @RequestParam - it takes the input in the form of parameter query
    @PatchMapping("/updatePatch/{id}")
    public String updateDoctorUsingPatch(@PathVariable int id,@RequestParam String newEmail, @RequestParam String newMobile){
        String response = doctorService.updateDoctorUsingPatch(id, newEmail, newMobile);
        return response;
    }
}
