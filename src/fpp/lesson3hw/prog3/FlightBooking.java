package fpp.lesson3hw.prog3;

public record FlightBooking(String origin, String destination, double distanceKm) {

    public FlightBooking {
        if (origin == null || destination == null || distanceKm == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
    }

    public double computeFlightTime(double avgSpeed) {
        return  avgSpeed * distanceKm;
    }

    @Override
    public String toString() {
        return "FlightBooking{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", distanceKm=" + distanceKm +
                '}';
    }
}
