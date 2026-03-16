package fpp.lesson12hw.prob2;

public class TestCustomerAccount {
    void main(){
        try{
            CustomerAccount customer1 = new CustomerAccount("Jon doe", "ddd", 200);
            customer1.deposit(100);
            System.out.println("Current balance:" + customer1.getBalance());
//            customer1.withdraw(1000); // insufficient funds
//            customer1.deposit(-1); // negative number
            customer1.withdraw(201); // valid number that drops to below 100
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (AccountException e){
            System.out.println(e.getMessage());
        }
    }
}
