package Patient;

import java.util.List;

public interface PatientManagerInterface {
    /**
     * @param patient patient to add
     */
    void addPatient(Patient patient);

    /**
     * @param id id of the patient
     */
    void removePatientByID(String id);

    /**
     * @param id id of the patient
     */
    void updatePatient(String id, Patient patient);

    /**
     * @param id id of the patient
     * @return patient with the given id
     */
    Patient getPatientById(String id);

    /**
     * @return all patients
     */
    List<Patient> getPatients();

    /**
     * @param lastName last name of the patient
     * @return all patients with the given last name
     */
    Patient[] getPatientsByLastName(String lastName);

    /**
     * @param lastName  last name of the patient
     * @param firstName first name of the patient
     * @return all patients with the given last name and first name
     */
    Patient[] getPatientsByLastNameAndFirstName(String lastName, String firstName);

    /**
     * @param lastName last name of the patient
     * @param birthday birthday of the patient
     * @return all patients with the given last name and birthday
     */

    Patient[] getPatientsByLastNameAndBirthday(String lastName, String birthday);

    /**
     * @param birthDay birthday of the patient
     * @return all patients with the given birthday
     */
    Patient[] getPatientsByBirthday(String birthDay);
}
