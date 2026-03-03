package fpp.lesson5hw.prob3;

public class HourlyEmployee extends Employee {
    double wage;
    double hour;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hour) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    double getPayment() {
        return wage * hour;
    }

    public double getWage() {
        return wage;
    }

    public double getHour() {
        return hour;
    }

    @Override
    public String toString() {
        return "Employee Type: Hourly" +
                "\nName: " + super.getName() +
                "\nSocial Security Number: " + super.getSocialSecurityNumber() +
                "\nWage: " + this.getWage() +
                "\nHour: " + this.getHour() +
                "\nFinal Payment: " + this.getPayment();
    }
}
