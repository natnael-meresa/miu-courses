package fpp.lesson5hw.prob2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor{
    String location;
    LocalDateTime lastUpdated;
    double  lightLevel;

    public LightSensor(String location, double lightLevel) {
        this.location = location;
        this.lastUpdated = LocalDateTime.now();
        this.lightLevel = lightLevel;
    }

    @Override
    public String getSensorType() {
        return "Light";
    }

    @Override
    public double getReading() {
        return this.lightLevel;
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
        if (lightLevel < 100) {
            return  "Light level is too low! Turning on the lights";
        }

        return  "Light is sufficient";
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
