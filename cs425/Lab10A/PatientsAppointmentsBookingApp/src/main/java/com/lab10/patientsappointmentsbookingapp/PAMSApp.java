package com.lab10.patientsappointmentsbookingapp;

import com.lab10.patientsappointmentsbookingapp.model.Patient;
import com.lab10.patientsappointmentsbookingapp.repository.PatientRepository;
import com.lab10.patientsappointmentsbookingapp.service.PatientService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class PAMSApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PAMSApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // --- 2.3: Create patient array using the given data ---
        Patient[] patients = {
                new Patient(1, "Daniel",  "Agar",       "(641) 123-0009", "dagar@m.as",     "1 N Street",        LocalDate.of(1987, 1, 19)),
                new Patient(2, "Ana",     "Smith",       null,             "amsith@te.edu",  null,                LocalDate.of(1948, 12, 5)),
                new Patient(3, "Marcus",  "Garvey",      "(123) 292-0018", null,             "4 East Ave",        LocalDate.of(2001, 9, 18)),
                new Patient(4, "Jeff",    "Goldbloom",   "(999) 165-1192", "jgold@es.co.za", null,                LocalDate.of(1995, 2, 28)),
                new Patient(5, "Mary",    "Washington",  null,             null,             "30 W Burlington",   LocalDate.of(1932, 5, 31))
        };

        // Load into repository/service
        PatientRepository repository = new PatientRepository();
        PatientService service = new PatientService(repository);
        for (Patient p : patients) {
            service.addPatient(p);
        }

        // --- Sort by age descending (oldest first) and convert to JSON ---
        List<Patient> sorted = service.getPatientsSortedByAgeDescending();

        // Build a list of maps so we control the JSON field order and include age
        java.util.List<Map<String, Object>> jsonList = new java.util.ArrayList<>();
        for (Patient p : sorted) {
            Map<String, Object> map = new LinkedHashMap<>();
            map.put("patientId",          p.getPatientId());
            map.put("firstName",          p.getFirstName());
            map.put("lastName",           p.getLastName());
            map.put("contactPhoneNumber", p.getContactPhoneNumber());
            map.put("email",              p.getEmail());
            map.put("mailingAddress",     p.getMailingAddress());
            map.put("dateOfBirth",        p.getDateOfBirth().toString());
            map.put("age",                p.getAge());
            jsonList.add(map);
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String json = mapper.writeValueAsString(jsonList);
        System.out.println("\n=== Patients sorted by Age (Oldest first) ===");
        System.out.println(json);
    }
}