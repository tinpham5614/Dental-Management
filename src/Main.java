import Patient.Patient;
import Patient.PatientManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Create initial patients
        List<Patient> initialPatients = new ArrayList<>() {
            {
                add(new Patient("1", "Doe", "John", "01/15/1980", "john.doe@example.com", "123-456-7890"));
                add(new Patient("2", "Smith", "Alice", "03/22/1995", "alice.smith@example.com", "234-567-8901"));
                add(new Patient("3", "Johnson", "Bob", "07/05/1988", "bob.johnson@example.com", "345-678-9012"));
                add(new Patient("4", "Brown", "Emily", "11/10/1976", "emily.brown@example.com", "456-789-0123"));
                add(new Patient("5", "Wilson", "David", "02/28/2000", "david.wilson@example.com", "567-890-1234"));
            }
        };
        // Create patient manager
        PatientManager patientManager = new PatientManager();
        initialPatients.forEach(patientManager::addPatient);
        // Print all patients
        System.out.println("<----- Initial patients ----->");
        System.out.println("All patients: " + patientManager.getPatients() + "\n");

        // Remove patient with id 1
        patientManager.removePatientByID("1");
        // Print all patients
        System.out.println("<----- After removing patient with id 1 ----->");
        System.out.println("All patients: " + patientManager.getPatients() + "\n");

        // Update patient with id 2
        patientManager.updatePatient("2", new Patient("2", "Smith", "Adam", "03/22/1995", "smith.adam@gmail.com", "234-567-8901"));
        // Print patient with id 2
        System.out.println("<----- After updating patient with id 2 ----->");
        System.out.println("Patient with id 2: " + patientManager.getPatientById("2") + "\n");

        // Print all patients with last name "Smith"
        System.out.println("<----- All patients with last name \"Smith\" ----->");
        System.out.println("All patients with last name \"Smith\": " + Arrays.toString(patientManager.getPatientsByLastName("Smith")) + "\n");

        // Print all patients with last name "Smith" and first name "Adam"
        System.out.println("<----- All patients with last name \"Smith\" and first name \"Adam\" ----->");
        System.out.println("All patients with last name \"Smith\" and first name \"Adam\": " + Arrays.toString(patientManager.getPatientsByLastNameAndFirstName("Smith", "Adam")) + "\n");

        // Print all patients with last name "Smith" and birthday "03/22/1995"
        System.out.println("<----- All patients with last name \"Smith\" and birthday \"03/22/1995\" ----->");
        System.out.println("All patients with last name \"Smith\" and birthday \"03/22/1995\": " + Arrays.toString(patientManager.getPatientsByLastNameAndBirthday("Smith", "03/22/1995")) + "\n");

        // Print all patients with birthday "03/22/1995"
        System.out.println("<----- All patients with birthday \"03/22/1995\" ----->");
        System.out.println("All patients with birthday \"03/22/1995\": " + Arrays.toString(patientManager.getPatientsByBirthday("03/22/1995")) + "\n");

        // Appointment
//        AppointmentManager appointmentManager = new AppointmentManager();
//        Appointment appointment = new Appointment("1", patientManager.getPatientById("2"), "1", AppointmentType.FOLLOW_UP, LocalDateTime.from(LocalDateTime.now()), LocalDateTime.now().plusHours(1), 60, "example");
//        Appointment appointment2 = new Appointment("2", patientManager.getPatientById("3"), "2", AppointmentType.FOLLOW_UP, LocalDateTime.from(LocalDateTime.now()), LocalDateTime.now().plusHours(1), 60, "example");
//        appointmentManager.addAppointment(appointment);
//        appointmentManager.addAppointment(appointment2);
//        appointmentManager.displaySchedule();
    }
}
