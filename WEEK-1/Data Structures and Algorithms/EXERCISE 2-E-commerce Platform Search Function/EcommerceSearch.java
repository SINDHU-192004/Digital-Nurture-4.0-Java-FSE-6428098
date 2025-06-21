// EcommerceSearch.java
// Week 1 Assignment – Exercise 2: E-commerce Platform Search Function
// Submitted by: SINDHU.T | Superset ID: 6428098

import java.util.Arrays;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public void display() {
        System.out.println("ID: " + productId + ", Name: " + productName + ", Category: " + category);
    }
}

public class EcommerceSearch {
    static Scanner sc = new Scanner(System.in);

    // Linear search by product name
    public static void linearSearch(Product[] products, String targetName) {
        System.out.println("\n🔍 Linear Search Result:");
        boolean found = false;
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                p.display();
                found = true;
            }
        }
        if (!found) System.out.println("Product not found.");
    }

    // Binary search by product name (array must be sorted)
    public static void binarySearch(Product[] products, String targetName) {
        System.out.println("\n Binary Search Result:");
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);
            if (cmp == 0) {
                products[mid].display();
                return;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Product not found.");
    }

    public static void main(String[] args) {
        Product[] productArray = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "Bag", "Accessories"),
            new Product(5, "Watch", "Accessories")
        };

        // Sorted array for binary search
        Product[] sortedArray = productArray.clone();
        Arrays.sort(sortedArray, (a, b) -> a.productName.compareToIgnoreCase(b.productName));

        System.out.print("Enter product name to search: ");
        String name = sc.nextLine();

        linearSearch(productArray, name);
        binarySearch(sortedArray, name);
    }
}
