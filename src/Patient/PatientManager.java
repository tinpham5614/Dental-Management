package Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientManager implements PatientManagerInterface {
    private final List<Patient> patientList;

    public PatientManager() {
        patientList = new ArrayList<>();
    }


    /**
     * @param patient patient to add
     */
    @Override
    public void addPatient(Patient patient) {
        if (patient == null) {
            throw new IllegalArgumentException("patient cannot be null");
        }
        if (patientList.contains(patient)) {
            throw new IllegalArgumentException("patient already exists");
        }
        patientList.add(patient);
        System.out.println("Patient added successfully");
    }

    /**
     * @param id id of the patient
     */
    @Override
    public void removePatientByID(String id) {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        patientList.remove(getPatientById(id));
        System.out.println("Patient removed successfully");
    }

    /**
     * @param id id of the patient
     */
    @Override
    public void updatePatient(String id, Patient patient) {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        if (patient == null) {
            throw new IllegalArgumentException("patient does not exist");
        }
        patientList.set(patientList.indexOf(patient), patient);
        System.out.println("Patient updated successfully");
    }

    /**
     * @param id id of the patient
     * @return patient with the given id
     */
    @Override
    public Patient getPatientById(String id) {
        if (id.isEmpty() || id.isBlank()) {
            throw new IllegalArgumentException("id cannot be null");
        }
        for (Patient patient : patientList) {
            if (patient.id().equals(id)) {
                return patient;
            }
        }
        return null;
    }

    /**
     * @return all patients
     */
    @Override
    public List<Patient> getPatients() {
        return patientList;
    }

    /**
     * @param lastName last name of the patient
     * @return all patients with the given last name
     */
    @Override
    public Patient[] getPatientsByLastName(String lastName) {
        if (lastName.isEmpty() || lastName.isBlank()) {
            throw new IllegalArgumentException("last name cannot be empty or blank");
        }
        for (Patient patient : patientList) {
            if (patient.lastName().equals(lastName)) {
                return new Patient[]{patient};
            }
        }
        return null;
    }

    /**
     * @param lastName  last name of the patient
     * @param firstName first name of the patient
     * @return all patients with the given last name and first name
     */
    @Override
    public Patient[] getPatientsByLastNameAndFirstName(String lastName, String firstName) {
        if (lastName.isEmpty() || lastName.isBlank()) {
            throw new IllegalArgumentException("last name cannot be empty or blank");
        }
        if (firstName.isEmpty() || firstName.isBlank()) {
            throw new IllegalArgumentException("first name cannot be empty or blank");
        }
        for (Patient patient : patientList) {
            if (patient.lastName().equals(lastName) && patient.firstName().equals(firstName)) {
                return new Patient[]{patient};
            }
        }
        return null;
    }

    /**
     * @param lastName last name of the patient
     * @param birthday birthday of the patient
     * @return all patients with the given last name and birthday
     */
    @Override
    public Patient[] getPatientsByLastNameAndBirthday(String lastName, String birthday) {
        if (lastName.isEmpty() || lastName.isBlank()) {
            throw new IllegalArgumentException("last name cannot be null");
        }
        if (birthday == null) {
            throw new IllegalArgumentException("birthday cannot be null");
        }
        for (Patient patient : patientList) {
            if (patient.lastName().equals(lastName) && patient.birthday().equals(birthday)) {
                return new Patient[]{patient};
            }
        }
        return null;
    }

    /**
     * @param birthDay birthday of the patient
     * @return all patients with the given birthday
     */
    @Override
    public Patient[] getPatientsByBirthday(String birthDay) {
        if (birthDay == null) {
            throw new IllegalArgumentException("birthday cannot be null");
        }
        for (Patient patient : patientList) {
            if (patient.birthday().equals(birthDay)) {
                return new Patient[]{patient};
            }
        }
        return null;
    }
}
