package fpp.lesson5hw.prob3;

public class SalariedEmployee extends  Employee {
    double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    double getPayment() {
        return weeklySalary;
    }


    @Override
    public String toString() {
        return "Employee Type: Salaried" +
                "\nName: " + super.getName() +
                "\nSocial Security Number: " + super.getSocialSecurityNumber() +
                "\nWeekly Salary: " + this.getWeeklySalary() +
                "\nFinal Payment: " + this.getPayment();
    }
}
