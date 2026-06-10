package com.lab10.patientsappointmentsbookingapp.repository;

import com.lab10.patientsappointmentsbookingapp.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientRepository {

    private final List<Patient> patients = new ArrayList<>();

    public void save(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> findAll() {
        return new ArrayList<>(patients);
    }

    public Patient findById(int patientId) {
        return patients.stream()
                .filter(p -> p.getPatientId() == patientId)
                .findFirst()
                .orElse(null);
    }
}