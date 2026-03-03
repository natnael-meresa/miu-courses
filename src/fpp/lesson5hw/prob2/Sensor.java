package fpp.lesson5hw.prob2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Sensor {
    String getSensorType();
    double getReading();
    String getLocation();
    LocalDateTime getLastUpdated();
    String performAction();
}
