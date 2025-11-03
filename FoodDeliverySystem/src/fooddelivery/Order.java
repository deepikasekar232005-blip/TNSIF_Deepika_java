package fooddelivery;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<FoodItem> orderedItems = new ArrayList<>();

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void addItem(FoodItem item) {
        orderedItems.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : orderedItems) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("\n==== Order Details ====");
        System.out.println(customer);
        System.out.println("\nOrdered Items:");
        for (FoodItem item : orderedItems) {
            System.out.println("- " + item.getName() + " ₹" + item.getPrice());
        }
        System.out.println("\nTotal Amount: ₹" + calculateTotal());
        System.out.println("=========================");
    }
}
