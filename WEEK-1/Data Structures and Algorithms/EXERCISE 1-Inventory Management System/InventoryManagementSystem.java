// SINDHU.T | Superset ID: 6428098

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void display() {
        System.out.println("ID: " + productId + ", Name: " + productName +
                ", Qty: " + quantity + ", Price: ₹" + price);
    }
}

public class InventoryManagementSystem {

    static HashMap<Integer, Product> inventory = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = scanner.nextInt();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        Product p = new Product(id, name, qty, price);
        inventory.put(id, p);
        System.out.println("Product Added.");
    }

    public static void updateProduct() {
        System.out.print("Enter Product ID to update: ");
        int id = scanner.nextInt();
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            System.out.print("Enter new quantity: ");
            int qty = scanner.nextInt();
            System.out.print("Enter new price: ");
            double price = scanner.nextDouble();
            p.quantity = qty;
            p.price = price;
            System.out.println("Product Updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        int id = scanner.nextInt();
        if (inventory.remove(id) != null) {
            System.out.println("Product Deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Current Inventory:");
        for (Map.Entry<Integer, Product> entry : inventory.entrySet()) {
            entry.getValue().display();
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> updateProduct();
                case 3 -> deleteProduct();
                case 4 -> displayInventory();
                case 5 -> System.out.println("🔚 Exiting...");
                default -> System.out.println("⚠️ Invalid choice.");
            }
        } while (choice != 5);
    }
}
