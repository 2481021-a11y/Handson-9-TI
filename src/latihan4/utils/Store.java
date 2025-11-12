package latihan4.utils;

import latihan4.product.Product;
import latihan4.customer.Customer;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private String storeName;
    private List<Product> inventory;
    private List<Customer> customers;
    private List<Order> orders;

    public Store(String storeName) {
        this.storeName = storeName;
        this.inventory = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    // ===== PRODUCT MANAGEMENT =====

    public void addProduct(Product product) {
        inventory.add(product);
        System.out.println("✓ Product added: " + product.getName());
    }

    public void removeProduct(String productId) {
        inventory.removeIf(p -> p.getProductId().equals(productId));
        System.out.println("✓ Product removed: " + productId);
    }

    public Product findProduct(String productId) {
        for (Product product : inventory) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    public void displayAllProducts() {
        System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    " + storeName + " - PRODUCT CATALOG                        ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
        System.out.println();

        if (inventory.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (Product product : inventory) {
            product.displayDetails();
            System.out.println();
        }
    }

    public void displayProductsByCategory(String category) {
        System.out.println("=== " + category + " Products ===\n");
        boolean found = false;

        for (Product product : inventory) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                product.displayDetails();
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found in category: " + category);
        }
    }

    // ===== CUSTOMER MANAGEMENT =====

    public void registerCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("✓ Customer registered: " + customer.getName());
    }

    public Customer findCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public void displayAllCustomers() {
        System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    REGISTERED CUSTOMERS                             ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
        System.out.println();

        if (customers.isEmpty()) {
            System.out.println("No customers registered.");
            return;
        }

        for (Customer customer : customers) {
            customer.displayInfo();
            System.out.println();
        }
    }

    // ===== ORDER MANAGEMENT =====

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("✓ Order processed: " + order.getOrderId());
    }

    public void displayAllOrders() {
        System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                        ORDER HISTORY                                ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
        System.out.println();

        if (orders.isEmpty()) {
            System.out.println("No orders yet.");
            return;
        }

        for (int i = 0; i < orders.size(); i++) {
            System.out.println("Order #" + (i + 1));
            orders.get(i).displayOrderSummary();
            System.out.println();
        }
    }

    public Order findOrder(String orderId) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }

    // ===== STATISTICS =====

    public void displayStoreStatistics() {
        System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    " + storeName + " - STATISTICS                           ║");
        System.out.println("╠═════════════════════════════════════════════════════════════════════╣");
        System.out.printf("║ Total Products: %-51d ║%n", inventory.size());
        System.out.printf("║ Total Customers: %-50d ║%n", customers.size());
        System.out.printf("║ Total Orders: %-53d ║%n", orders.size());

        // Hitung total revenue dari semua orders
        double totalRevenue = 0;
        for (Order order : orders) {
            totalRevenue += order.getGrandTotal();
        }
        System.out.printf("║ Total Revenue: Rp %-45.0f ║%n", totalRevenue);

        System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
    }

    // ===== SEARCH FUNCTIONS =====

    public List<Product> searchProducts(String keyword) {
        List<Product> results = new ArrayList<>();
        String lowerKeyword = keyword.toLowerCase();

        for (Product product : inventory) {
            if (product.getName().toLowerCase().contains(lowerKeyword) ||
                    product.getProductId().toLowerCase().contains(lowerKeyword)) {
                results.add(product);
            }
        }

        return results;
    }

    // ===== GETTERS =====

    public String getStoreName() {
        return storeName;
    }

    public List<Product> getInventory() {
        return inventory;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Order> getOrders() {
        return orders;
    }
}