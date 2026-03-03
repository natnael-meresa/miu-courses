package fpp.lesson5hw.prob3;

public abstract class Employee {
    String firstName;
    String lastName;
    String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public  String getName() {
        return  firstName + " " + lastName;
    }

    abstract double getPayment();
}
