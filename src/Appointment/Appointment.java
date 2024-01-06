package Appointment;

import Patient.Patient;

import java.time.LocalDateTime;


/**
 * @param id         id of the appointment
 * @param patientId  id of the patient
 * @param doctorId   id of the doctor
 * @param apptType   type of the appointment
 * @param dateTime   date and time of the appointment
 * @param timeLength length of the appointment
 * @param notes      notes of the appointment
 */
public record Appointment(String id, Patient patientId, String doctorId, String apptType, LocalDateTime dateTime,
                          Integer timeLength, String notes) {
    /**
     * @param obj the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Appointment appointment) {
            return appointment.id.equals(id);
        }
        return false;
    }
}
