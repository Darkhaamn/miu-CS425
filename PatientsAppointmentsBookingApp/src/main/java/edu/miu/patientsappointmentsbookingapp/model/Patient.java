package edu.miu.patientsappointmentsbookingapp.model;

import java.time.LocalDate;
import java.time.Period;

public class Patient {
    private Long patientId;
    private String firstName;
    private String lastName;
    private String contactPhoneNumber;
    private String email;
    private Address mailingAddress;
    private LocalDate dateOfBirth;

    public Patient(Long patientId, String firstName, String lastName,
                   String contactPhoneNumber, String email,
                   Address mailingAddress, LocalDate dateOfBirth) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.email = email;
        this.mailingAddress = mailingAddress;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getPatientId() {
        return patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}