package edu.miu.patientsappointmentsbookingapp.service;

import edu.miu.patientsappointmentsbookingapp.model.Patient;
import edu.miu.patientsappointmentsbookingapp.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getPatientsSortedByAgeDescending() {
        return patientRepository.getAllPatients()
                .stream()
                .sorted(Comparator.comparingInt(Patient::getAge).reversed())
                .toList();
    }
}