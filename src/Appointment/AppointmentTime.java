package Appointment;

public class AppointmentTime {
    private String date;
    private String startTime;
    private String endTime;

    public AppointmentTime(String date, String startTime, String endTime) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getDate() {
        return this.date;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        String str = "Date: " + this.date + "\n" +
                "Start Time: " + this.startTime + "\n" +
                "End Time: " + this.endTime + "\n";
        return str;
    }
}
