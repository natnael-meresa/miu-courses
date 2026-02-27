package fpp.lesson3hw.prog3;

public class CarRental {
    private String carModel;
    private int days;
    private double ratePerDay;
    private double milesPerDay;

    public  CarRental(String carModel, int days, double ratePerDay, double milesPerDay) {
        this.carModel = carModel;
        this.days = days;
        this.ratePerDay = ratePerDay;
        this.milesPerDay = milesPerDay;
    }

    public double totalMilesAllowed() {
        return  days * milesPerDay;
    }

    public double totalRentalCost() {
        return  days * ratePerDay;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getRatePerDay() {
        return ratePerDay;
    }

    public void setRatePerDay(double ratePerDay) {
        this.ratePerDay = ratePerDay;
    }

    public double getMilesPerDay() {
        return milesPerDay;
    }

    public void setMilesPerDay(double milesPerDay) {
        this.milesPerDay = milesPerDay;
    }

    @Override
    public String toString() {
        return "CarRental{" +
                "carModel='" + carModel + '\'' +
                ", days=" + days +
                ", ratePerDay=" + ratePerDay +
                ", milesPerDay=" + milesPerDay +
                '}';
    }
}
