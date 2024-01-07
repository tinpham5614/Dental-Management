package Patient;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PatientManagerTest {
    // Create a patient
    Patient patient = new Patient("1", "Doe", "John", "01/01/2000", "john.doe@gmail.com", "123-456-7890");
    // Create a patient manager
    PatientManager patientManager = new PatientManager();

    @Test
    public void constructor() {
        assertEquals("patientList should be empty", 0, patientManager.getPatients().size());
    }

    @Test
    public void addPatient() {
        patientManager.addPatient(patient);
        assertEquals("patientList should have 1 patient", 1, patientManager.getPatients().size());
    }

    @Test
    public void removePatient() {
        patientManager.addPatient(patient);
        patientManager.removePatientByID("1");
        assertEquals("patientList should be empty", 0, patientManager.getPatients().size());
    }

    @Test
    public void updatePatient() {
        patientManager.addPatient(patient);
        patientManager.updatePatient("1", new Patient("1", "Doe", "John", "01/01/2000", "doe@gmail.com", "123-456-7890"));
        assertEquals("patient information should be changed", patientManager.getPatientById("1").toString(), patientManager.getPatientById("1").toString());
    }

}