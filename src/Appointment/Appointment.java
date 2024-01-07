package Appointment;

import Patient.Patient;


/**
 * @param id              id of the appointment
 * @param patient         id of the patient
 * @param doctorId        id of the doctor
 * @param appointmentType type of the appointment
 * @param appointmentTime date and time of the appointment
 * @param timeLength      length of the appointment
 * @param notes           notes of the appointment
 */
public record Appointment(String id, Patient patient, String doctorId, AppointmentType appointmentType,
                          AppointmentTime appointmentTime,
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