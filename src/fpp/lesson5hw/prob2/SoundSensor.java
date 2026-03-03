package fpp.lesson5hw.prob2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class SoundSensor implements Sensor{
    String location;
    LocalDateTime lastUpdated;
    double soundLevel;

    public SoundSensor(String location,double soundLevel) {
        this.location = location;
        this.lastUpdated = LocalDateTime.now();
        this.soundLevel = soundLevel;
    }

    @Override
    public String getSensorType() {
        return "Sound";
    }

    @Override
    public double getReading() {
        return this.soundLevel;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public LocalDateTime getLastUpdated() {
        this.lastUpdated = LocalDateTime.now();
        return this.lastUpdated;
    }

    @Override
    public String performAction() {
        if (this.soundLevel > 70) {
            return  "The noise to loud! turn on noise cancellation";
        } else {
            return "Sound is within normal range.";
        }
    }

    @Override
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
        return "Sensor Type: " + this.getSensorType() +
                "\nReading: " + this.getReading() +
                "\nLocation: " + this.getLocation() +
                "\nLast Updated: " + formatter.format(this.getLastUpdated()) +
                "\nAction: " + this.performAction();
    }
}
