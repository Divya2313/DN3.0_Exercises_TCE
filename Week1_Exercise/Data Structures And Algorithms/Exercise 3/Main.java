import java.util.Arrays;

class Order {
    private int orderId;
    private String customerName;
    private double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return String.format("Order ID: %d, Customer: %s, Total Price: %.2f", orderId, customerName, totalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        Order[] orders = new Order[] {
                new Order(1, "John", 100.0),
                new Order(2, "Alice", 50.0),
                new Order(3, "Bob", 200.0),
                new Order(4, "Eve", 150.0),
                new Order(5, "Charlie", 75.0)
        };

        System.out.println("Original Order List:");
        displayOrders(orders);

        // Bubble Sort
        bubbleSortOrders(orders);
        System.out.println("Orders Sorted by Bubble Sort:");
        displayOrders(orders);

        // Reset and Quick Sort
        orders = new Order[] {
                new Order(1, "John", 100.0),
                new Order(2, "Alice", 50.0),
                new Order(3, "Bob", 200.0),
                new Order(4, "Eve", 150.0),
                new Order(5, "Charlie", 75.0)
        };

        quickSortOrders(orders, 0, orders.length - 1);
        System.out.println("Orders Sorted by Quick Sort:");
        displayOrders(orders);
    }

    public static void bubbleSortOrders(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].getTotalPrice() < orders[j + 1].getTotalPrice()) {
                    // Swap
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSortOrders(Order[] orders, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionOrders(orders, low, high);
            quickSortOrders(orders, low, pivotIndex - 1);
            quickSortOrders(orders, pivotIndex + 1, high);
        }
    }

    public static int partitionOrders(Order[] orders, int low, int high) {
        Order pivot = orders[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() > pivot.getTotalPrice()) {
                i++;
                // Swap
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        // Swap pivot into place
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static void displayOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
        System.out.println();
    }
}
