package fpp.lesson3hw.prog1;

public class Prog1 {
    void main() {
        Address billing1 = new Address("Chicago", "North street", "12234");
        Address shipping1 = new Address("New York", "Time square", "12344");

        Address billing2 = new Address("California", "North street", "12234");
        Address shipping2 = new Address("New York", "Time square", "12344");

        Address billing3 = new Address("Chicago", "North street", "12234");
        Address shipping3 = new Address("New York", "Time square", "12344");


        Customer customer1 = new Customer("Jon", "Doe", "6797");
        Customer customer2 = new Customer("Joe", "Smith", "23455");
        Customer customer3 = new Customer("Chris", "Goodman", "5284002");

        customer1.setBillingAddress(billing1);
        customer1.setShippingAddress(shipping1);

        customer2.setBillingAddress(billing2);
        customer2.setShippingAddress(shipping2);

        customer3.setBillingAddress(billing3);
        customer3.setShippingAddress(shipping3);

        Customer[] customers = {customer1, customer2, customer3};

        for (Customer customer: customers) {
            if (customer.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(customer);
            }
        }
    }
}
