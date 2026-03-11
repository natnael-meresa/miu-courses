package fpp.lesson8hw.prob3;

import java.util.*;

public class OrderTest {
    public static void main(String[] args) {
        // a) through i) here, print after each step (use for-each)

        // a,
        ArrayList<Order> orders = new ArrayList<>();
        display(orders);

        // b,
        orders.add(new Order("1", "John Smith", 122));
        orders.add(new Order("2", "John Doe", 142));
        orders.add(new Order("4", "John Goodman", 162));
        Order ord1 = new Order("5", "John Killer", 175);
        Order ord2 = new Order("6", "John Nat", 132);
        orders.add(ord1);
        orders.add(ord2);
        System.out.println("B: ");
        display(orders);

        // c,

        orders.remove(ord1);
        System.out.println("C: ");
        display(orders);

        // d
        System.out.println("D: ");
        System.out.println("New size: " + orders.size());
        display(orders);

        // e
        System.out.println("E: ");
        Order byindex = orders.get(3);
        System.out.println("Third index order: " + byindex);
        display(orders);

        // f
        System.out.println("F: ");
        orders.set(3, new Order("10", "New Guy", 1000));
        display(orders);

        // h
        System.out.println("H: ");
        // suggestion by the compiler : I intended to use Collections.sort but the compiler suggested this.
        orders.sort(Comparator.comparing(Order::getTotalAmount).
                thenComparing(Order::getCustomerName).
                thenComparing(Order::getOrderId));

        display(orders);

        // i
        System.out.println("I: ");
        List<Order> newOrders = listMoreThan50(orders);
        orders.sort(Comparator.comparing(Order::getCustomerName).
                thenComparing(Order::getTotalAmount).
                thenComparing(Order::getOrderId));
        display(newOrders);
    }

    public static List<Order> listMoreThan50(List<Order> list) {
        // return new ArrayList<>(...) with totalAmount > 50.0
        List<Order> newOrders = new ArrayList<Order>();
        for (Order order: list) {
            if (order.getTotalAmount() > 50) {
                newOrders.add(order);
            }
        }
        return newOrders;
    }

    private static void display(List<Order> orders) {
        for (Order order: orders) {
            System.out.println(order);
        }
    }
}
