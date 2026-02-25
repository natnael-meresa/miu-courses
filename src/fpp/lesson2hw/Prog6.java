package fpp.lesson2hw;

import java.util.Scanner;

public class Prog6 {
    void  main() {
        generateElectricBill();
    }

    void generateElectricBill() {
        Scanner input = new Scanner(System.in);
        String userDecision = "y";
        do {
            System.out.print("Enter user type (R/C/I): ");
            String userType = input.next();
            System.out.print("Enter units consumed: ");
            int unitConsumed = input.nextInt();

            double bill = switch (userType) {
                case "R" -> unitConsumed * 0.12;
                case "C" -> unitConsumed * 0.20;
                case "I" -> unitConsumed * 0.35;
                default -> 0.0;
            };

            System.out.println("=== Electricity Bill ===");
            System.out.println("User Type: "+ userType);
            System.out.println("Units: " + unitConsumed);
            System.out.println("Bill Amount: $" + bill);

            System.out.print("Do you want to calculate another bill? (y/n):  ");
            userDecision = input.next();

        } while(userDecision.equals("y") || userDecision.equals("Y"));

        System.out.println("\nGoodbye! Thanks for using the Electricity Bill Generator.");
    }
}
