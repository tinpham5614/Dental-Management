package Appointment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppointmentManager implements AppointmentManagerInterface {
    private final List<Appointment> schedule;

    public AppointmentManager() {
        schedule = new ArrayList<>();
    }


    /**
     * Displays the schedule
     */
    @Override
    public void displaySchedule() {
        System.out.println("<---------- Schedule ---------->");
        for (Appointment appointment : schedule) {
            System.out.println(appointment + "\n");
        }
    }

    /**
     * @param appointment appointment to add
     */
    @Override
    public void addAppointment(Appointment appointment, AppointmentTime appointmentTime) {
        if (appointment == null) {
            throw new IllegalArgumentException("appointment cannot be null");
        }
        if (schedule.contains(appointment)) {
            throw new IllegalArgumentException("appointment already exists");
        }
        if (appointmentTime == null) {
            throw new IllegalArgumentException("appointmentTime cannot be null");
        }
        for (Appointment existingAppointment : schedule) {
            if (existingAppointment.appointmentTime().startTime().isBefore(appointmentTime.endTime()) && existingAppointment.appointmentTime().endTime().isAfter(appointmentTime.startTime())) {
                throw new IllegalArgumentException("Unavailable time slot");
            }
        }
        schedule.add(appointment);
        System.out.println("Appointment added successfully");
    }

    /**
     * @param appointment appointment to remove
     * @param dateTime    date and time of the appointment
     */
    @Override
    public void rescheduleAppointment(Appointment appointment, LocalDateTime dateTime) {

    }

    /**
     * @param appointment appointment to remove
     */
    @Override
    public void cancelAppointment(Appointment appointment) {

    }

    /**
     * @param appointment appointment to update
     */
    @Override
    public void updateAppointment(Appointment appointment) {

    }
}
