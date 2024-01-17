package Appointment;

import java.time.LocalDateTime;

public record AppointmentTime(LocalDateTime startTime, LocalDateTime endTime) {
}
