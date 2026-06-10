package com.lab10.patientsappointmentsbookingapp.service;

import com.lab10.patientsappointmentsbookingapp.model.Patient;
import com.lab10.patientsappointmentsbookingapp.repository.PatientRepository;

import java.util.Comparator;
import java.util.List;

public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    /**
     * Returns all patients sorted by age descending (oldest first, youngest last).
     */
    public List<Patient> getPatientsSortedByAgeDescending() {
        List<Patient> sorted = patientRepository.findAll();
        sorted.sort(Comparator.comparingInt(Patient::getAge).reversed());
        return sorted;
    }
}