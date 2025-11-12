package latihan4.utils;

import latihan4.product.Product;
import latihan4.customer.Customer;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Customer customer;
    private List<CartItem> items;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        // Cek apakah produk sudah ada di cart
        for (CartItem item : items) {
            if (item.getProduct().getProductId().equals(product.getProductId())) {
                item.setQuantity(item.getQuantity() + quantity);
                System.out.println("✓ Updated quantity for: " + product.getName());
                return;
            }
        }

        // Jika produk belum ada, tambahkan baru
        items.add(new CartItem(product, quantity));
        System.out.println("✓ Added to cart: " + product.getName() + " (x" + quantity + ")");
    }

    public void displayCart() {
        System.out.println("┌─────────────────────────────────────────────────────────────────────┐");
        System.out.println("│ SHOPPING CART - " + customer.getName() + "                                        │");
        System.out.println("├─────────────────────────────────────────────────────────────────────┤");

        for (CartItem item : items) {
            Product p = item.getProduct();
            System.out.printf("│ %-30s x%-3d Rp %,15.0f │%n",
                    p.getName(), item.getQuantity(), item.getSubtotal());
        }

        System.out.println("├─────────────────────────────────────────────────────────────────────┤");
        double subtotal = calculateSubtotal();
        double discount = subtotal * customer.getDiscount();
        double total = subtotal - discount;

        System.out.printf("│ Subtotal:%54s Rp %,12.0f │%n", "", subtotal);
        System.out.printf("│ Discount (%s - %.0f%%):%38s Rp %,12.0f │%n",
                customer.getMembershipLevel(), customer.getDiscount() * 100, "", -discount);
        System.out.printf("│ Total:%57s Rp %,12.0f │%n", "", total);
        System.out.println("└─────────────────────────────────────────────────────────────────────┘");
    }

    public double calculateSubtotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public double calculateTotal() {
        double subtotal = calculateSubtotal();
        return subtotal - (subtotal * customer.getDiscount());
    }

    public List<CartItem> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }
}