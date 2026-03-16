package fpp.lesson12hw.prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        while (true) {
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter quantity of items to add (1-50): ");
                int quantity = sc.nextInt();
                if (quantity < 1 || quantity > 50) throw new IllegalArgumentException("Quantity must between 1 and 50");
                System.out.println("Successfully added " + quantity + " items to your cart!");

                break;
            } catch (InputMismatchException e){
                System.out.println("Quantity must be integer and between 1 and 50");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
