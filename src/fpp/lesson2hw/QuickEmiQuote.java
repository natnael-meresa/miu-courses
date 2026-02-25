package fpp.lesson2hw;


import java.util.random.RandomGenerator;

public class QuickEmiQuote {
    void main() {
        RandomGenerator rand =  RandomGenerator.getDefault();
         //  principal
         int p = rand.nextInt(5000,25000);
         // tensure
        int n = rand.nextInt(6, 36);
        // annual interest rate
        double apr = rand.nextDouble(3.5, 11.5);

        // monthly rate
        double r = apr / ((double) 12 /100);
        double emi = (p * r * Math.pow(1+r, n)) / (Math.pow(1+r, n) - 1);
        double totalPayment  = emi * n;
        double totalInterest = totalPayment - p;

        IO.println("############################################################################");
        IO.println("############################################################################");
        IO.println("################################# EMI Quote ################################");
        IO.println("Principal:  " + p+ "\tTensure:  " + n+ "\tAnnual interest Rate(APR):  " + apr );
        IO.println("Monthly Rate (apr / 12 / 100) :  " + r);
        System.out.printf("EMI: %.2f \n", emi);
        IO.println("EMI Casted to int: " + (int) emi);
        IO.println("EMI Rounded to the nearest integer: " + Math.round(emi));
        System.out.printf("Total Payment (emi * tensure) : %.2f %n", totalPayment);
        IO.println("TotalInterest:   " + totalInterest);
        System.out.printf("TotalInterest rounded: %.2f", totalInterest);
    }
}
