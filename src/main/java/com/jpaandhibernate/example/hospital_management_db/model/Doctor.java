package com.jpaandhibernate.example.hospital_management_db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  // it represents that this class is entity or model class which is directly creating the database table or schema
@Table(name = "doctor") // it will create a table inside database with name given
@Data // add getters and setters
@AllArgsConstructor // parameterized constructor
@NoArgsConstructor // default constructor
public class Doctor {

    @Id // it is the primary key of the table - it will be unique and it is not null
    @Column(name="id")  // it will create a column inside database table
    private int id;

    @Column(name="doctor_name", nullable = false) // nullable = false - it cannot contain null value
    private String name;

    @Column(name="email", nullable = false, unique = true) // unique=true - it cannot contain duplicated value
    private String email;

    @Column(name="dob", nullable = false)
    private String dob;

    @Column(name="specialization", nullable = false)
    private String specialization;

    @Column(name="mobile", nullable = false, unique = true) // unique=true - it cannot contain duplicated value
    private String mobile;
}
