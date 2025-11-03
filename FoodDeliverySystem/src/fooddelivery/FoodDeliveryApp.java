package fooddelivery;

import java.util.Scanner;

public class FoodDeliveryApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to QuickBite Food Delivery ===");

        // Customer details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your address: ");
        String address = sc.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = sc.nextLine();

        Customer customer = new Customer(name, address, phone);
        Order order = new Order(customer);

        // Food menu
        FoodItem[] menu = {
            new FoodItem(1, "Pizza", 250),
            new FoodItem(2, "Burger", 150),
            new FoodItem(3, "Pasta", 200),
            new FoodItem(4, "Sandwich", 120),
            new FoodItem(5, "Fried Rice", 180)
        };

        System.out.println("\n=== Menu ===");
        for (FoodItem item : menu) {
            System.out.println(item);
        }

        // Take order
        while (true) {
            System.out.print("\nEnter item number to order (0 to finish): ");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            }

            boolean found = false;
            for (FoodItem item : menu) {
                if (item.getId() == choice) {
                    order.addItem(item);
                    System.out.println(item.getName() + " added to your order!");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        // Display final order
        order.displayOrderDetails();

        System.out.println("\nThank you for ordering with QuickBite! 🍔");
        sc.close();
    }
}

