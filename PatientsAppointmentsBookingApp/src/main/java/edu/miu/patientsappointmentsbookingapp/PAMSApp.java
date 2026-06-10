package edu.miu.patientsappointmentsbookingapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import edu.miu.patientsappointmentsbookingapp.model.Patient;
import edu.miu.patientsappointmentsbookingapp.service.PatientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PAMSApp implements CommandLineRunner {

    private final PatientService patientService;

    public PAMSApp(PatientService patientService) {
        this.patientService = patientService;
    }

    public static void main(String[] args) {
        SpringApplication.run(PAMSApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Patient> patients = patientService.getPatientsSortedByAgeDescending();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.findAndRegisterModules();

        String jsonOutput = objectMapper.writeValueAsString(patients);

        System.out.println(jsonOutput);
    }
}