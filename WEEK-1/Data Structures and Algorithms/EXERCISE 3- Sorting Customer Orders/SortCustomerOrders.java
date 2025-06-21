// SortCustomerOrders.java
// Week 1 Assignment – Exercise 3: Sorting Customer Orders
// Submitted by: SINDHU.T | Superset ID: 6428098

class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public void display() {
        System.out.println("Order ID: " + orderId + ", Customer: " + customerName + ", Total: ₹" + totalPrice);
    }
}

public class SortCustomerOrders {

    // Bubble Sort by totalPrice
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort by totalPrice
    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    public static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    public static void displayOrders(Order[] orders, String sortType) {
        System.out.println("\n Orders sorted using " + sortType + ":");
        for (Order order : orders) {
            order.display();
        }
    }

    public static void main(String[] args) {
        Order[] orderArray = {
            new Order(101, "Alice", 3500.0),
            new Order(102, "Bob", 1500.0),
            new Order(103, "Charlie", 2500.0),
            new Order(104, "Daisy", 5000.0)
        };

        // Bubble Sort Output
        Order[] bubbleSorted = orderArray.clone();
        bubbleSort(bubbleSorted);
        displayOrders(bubbleSorted, "Bubble Sort");

        // Quick Sort Output
        Order[] quickSorted = orderArray.clone();
        quickSort(quickSorted, 0, quickSorted.length - 1);
        displayOrders(quickSorted, "Quick Sort");
    }
}
