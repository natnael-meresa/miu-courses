package com.lab10.patientsappointmentsbookingapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
@AllArgsConstructor
public class Patient {

    private int patientId;
    private String firstName;
    private String lastName;
    private String contactPhoneNumber;
    private String email;
    private String mailingAddress;
    private LocalDate dateOfBirth;


    public int getAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }
}