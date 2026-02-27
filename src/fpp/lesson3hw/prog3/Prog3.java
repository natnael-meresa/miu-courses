package fpp.lesson3hw.prog3;

import java.util.Scanner;

public class Prog3 {
    void main() {
        Scanner input = new Scanner(System.in);

        String userDecision = "y";
        do {
            System.out.println("Enter F for Flight Booking\n" +
                    "Enter H for Hotel Booking\n" +
                    "Enter C for Car Rental");
            String choice = input.nextLine();

            switch (choice) {
                case "F":
                    System.out.print("Enter origin: ");
                    String origin = input.nextLine();
                    System.out.print("Enter destination:  ");
                    String destination = input.nextLine();
                    System.out.println("Enter distance in km: ");
                    double distance = input.nextDouble();
                    System.out.println("Enter average speed (km/h): ");
                    double averageSpeed = input.nextDouble();

                    FlightBooking f1 = new FlightBooking(origin, destination, distance);


                    System.out.println("Estimated Flight Time:  " + f1.computeFlightTime(averageSpeed));
                case "H":
                    System.out.println("Enter hotel name: ");
                    String hotelName = input.nextLine();
                    System.out.println("Enter number of nights: ");
                    int nights = input.nextInt();
                    System.out.println("Enter price per night: ");
                    double pricePerNight = input.nextDouble();

                    HotelBooking h1 = new HotelBooking(hotelName, nights, pricePerNight);

                    System.out.printf("Total Hotel Cost: %.2f \n", h1.totalCost());
                case "C":
                    System.out.println("Enter car model: ");
                    String carModel = input.nextLine();
                    System.out.println("Enter number of days: ");
                    int days = input.nextInt();
                    System.out.println("Enter rate per day:  ");
                    double ratePerDay = input.nextDouble();
                    System.out.println("Enter miles per day: ");
                    double milesPerDay = input.nextDouble();

                    CarRental c1 = new CarRental(carModel, days, ratePerDay, milesPerDay);

                    System.out.printf("Total Rental Cost:  %.2f \n" , c1.totalRentalCost());
                    System.out.printf("Total Miles Allowed:  %.2f \n" , c1.totalMilesAllowed());
                default:
                    System.out.println("Please enter valid input to use the system");
            }

            System.out.println("Do you want to continue (y/n): ");
            userDecision = input.nextLine();
            System.out.println("\n\n\n\n");

        } while (!userDecision.equals("n") && !userDecision.equals("N"));

    }
}
