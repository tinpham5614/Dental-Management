package Appointment;

import java.time.LocalDateTime;

public interface AppointmentManagerInterface {
    /**
     * @param appointment appointment to add
     */
    void addAppointment(Appointment appointment);

    /**
     * @param appointment appointment to remove
     * @param dateTime    date and time of the appointment
     */
    void rescheduleAppointment(Appointment appointment, LocalDateTime dateTime);

    /**
     * @param appointment appointment to remove
     */
    void cancelAppointment(Appointment appointment);

    /**
     * @param appointment appointment to update
     */
    void updateAppointment(Appointment appointment);
}
