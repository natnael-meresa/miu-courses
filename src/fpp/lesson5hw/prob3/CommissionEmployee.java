package fpp.lesson5hw.prob3;

public class CommissionEmployee extends  Employee {
    double grossSales;
    double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    double getPayment() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return "Employee Type: Commission" +
                "\nName: " + super.getName() +
                "\nSocial Security Number: " + super.getSocialSecurityNumber() +
                "\nGross Sales: " + this.getGrossSales() +
                "\nCommission Rate: " + this.getCommissionRate() +
                "\nFinal Payment: " + this.getPayment();
    }
}
