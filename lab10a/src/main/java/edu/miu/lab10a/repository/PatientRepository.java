package edu.miu.lab10a.repository;

import edu.miu.lab10a.model.Address;
import edu.miu.lab10a.model.Patient;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PatientRepository {

    public List<Patient> getAllPatients() {
        List<Patient> patients = new ArrayList<>();

        patients.add(new Patient(
                1L,
                "Daniel",
                "Agar",
                "(641) 123-0009",
                "dagar@m.as",
                new Address("1 N Street", "Fairfield", "IA", "52557"),
                LocalDate.of(1987, 1, 19)
        ));

        patients.add(new Patient(
                2L,
                "Ana",
                "Smith",
                null,
                "amsith@te.edu",
                null,
                LocalDate.of(1948, 12, 5)
        ));

        patients.add(new Patient(
                3L,
                "Marcus",
                "Garvey",
                "(123) 292-0018",
                null,
                new Address("4 East Ave", "Fairfield", "IA", "52557"),
                LocalDate.of(2001, 9, 18)
        ));

        patients.add(new Patient(
                4L,
                "Jeff",
                "Goldbloom",
                "(999) 165-1192",
                "jgold@es.co.za",
                null,
                LocalDate.of(1995, 2, 28)
        ));

        patients.add(new Patient(
                5L,
                "Mary",
                "Washington",
                null,
                null,
                new Address("30 W Burlington", "Fairfield", "IA", "52557"),
                LocalDate.of(1932, 5, 31)
        ));

        return patients;
    }
}