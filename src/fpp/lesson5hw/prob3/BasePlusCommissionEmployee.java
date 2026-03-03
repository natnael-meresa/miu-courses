package fpp.lesson5hw.prob3;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    double getPayment() {
        return baseSalary + super.getPayment();
    }


    @Override
    public String toString() {
        return "Employee Type: Base Plus Commission" +
                "\nName: " + super.getName() +
                "\nSocial Security Number: " + super.getSocialSecurityNumber() +
                "\nGross Sales: " + super.getGrossSales() +
                "\nCommission Rate: " + super.getCommissionRate() +
                "\nBase Salary"+ this.getBaseSalary() +
                "\nFinal Payment: " + this.getPayment();
    }
}
