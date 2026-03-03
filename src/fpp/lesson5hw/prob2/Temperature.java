package fpp.lesson5hw.prob2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Temperature implements Sensor{
    String location;
    LocalDateTime lastUpdated;
    double temperature;

    public Temperature(String location, double temperature) {
        this.location = location;
        this.lastUpdated = LocalDateTime.now();
        this.temperature = temperature;
    }

    @Override
    public String getSensorType() {
        return "Temperature";
    }

    @Override
    public double getReading() {
        return this.temperature;
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
        if (this.temperature > 30) {
            return  "Temperature is too high!! turn on the AC";
        } else if (this.temperature < 18) {
            return "Temperature is too low!! turn on the Heater";
        }

        return  "Temperature is within normal range";
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
