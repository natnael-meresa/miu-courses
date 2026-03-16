package fpp.lesson12hw.prob2;
public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must greater then zero");
        } else if (amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance");
        }

        if (balance - amount < 100) {
            throw  new AccountException("Low balance warning! Balance cannot go below $100");
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
