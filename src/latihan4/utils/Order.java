package latihan4.utils;

import latihan4.customer.Customer;
import latihan4.payment.Payment;
import latihan4.shipping.ShippingMethod;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {
    private String orderId;
    private Customer customer;
    private ShoppingCart cart;
    private Payment payment;
    private ShippingMethod shipping;
    private double weight;
    private LocalDateTime orderDate;

    public Order(String orderId, Customer customer, ShoppingCart cart,
                 Payment payment, ShippingMethod shipping, double weight) {
        this.orderId = orderId;
        this.customer = customer;
        this.cart = cart;
        this.payment = payment;
        this.shipping = shipping;
        this.weight = weight;
        this.orderDate = LocalDateTime.now();
    }

    public double getGrandTotal() {
        double afterDiscount = cart.calculateTotal();
        double shippingCost = shipping.calculateShippingCost(weight);
        return afterDiscount + shippingCost;
    }

    public String getOrderId() {
        return orderId;
    }

    public void displayOrderSummary() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                         ORDER SUMMARY                               ║");
        System.out.println("╠═════════════════════════════════════════════════════════════════════╣");
        System.out.printf("║ Order ID: %-57s ║%n", orderId);
        System.out.printf("║ Date: %-61s ║%n", orderDate.format(formatter));
        System.out.println("╠═════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ CUSTOMER INFORMATION                                                ║");
        System.out.printf("║ Name: %-61s ║%n", customer.getName());
        System.out.printf("║ Email: %-60s ║%n", customer.getEmail());
        System.out.printf("║ Membership: %-55s ║%n", customer.getMembershipLevel());
        System.out.println("╠═════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ ORDER ITEMS                                                         ║");

        for (CartItem item : cart.getItems()) {
            System.out.printf("║ %-30s x%-3d Rp %,15.0f ║%n",
                    item.getProduct().getName(),
                    item.getQuantity(),
                    item.getSubtotal());
        }

        System.out.println("╠═════════════════════════════════════════════════════════════════════╣");

        double subtotal = cart.calculateSubtotal();
        double discount = subtotal * customer.getDiscount();
        double afterDiscount = subtotal - discount;
        double shippingCost = shipping.calculateShippingCost(weight);
        double grandTotal = afterDiscount + shippingCost;

        System.out.printf("║ Subtotal:%54s Rp %,12.0f ║%n", "", subtotal);
        System.out.printf("║ Discount (%s - %.0f%%):%38s Rp %,12.0f ║%n",
                customer.getMembershipLevel(), customer.getDiscount() * 100, "", -discount);
        System.out.printf("║ After Discount:%47s Rp %,12.0f ║%n", "", afterDiscount);
        System.out.printf("║ Shipping (%s - %.1fkg):%30s Rp %,12.0f ║%n",
                shipping.getShippingName(), weight, "", shippingCost);
        System.out.println("╠═════════════════════════════════════════════════════════════════════╣");
        System.out.printf("║ GRAND TOTAL:%50s Rp %,12.0f ║%n", "", grandTotal);
        System.out.println("╠═════════════════════════════════════════════════════════════════════╣");
        System.out.println("║ PAYMENT & SHIPPING                                                  ║");
        System.out.printf("║ Payment Method: %-51s ║%n", payment.getPaymentMethod());
        System.out.printf("║ Transaction ID: %-51s ║%n", payment.getTransactionId());
        System.out.printf("║ Shipping Method: %-50s ║%n", shipping.getShippingName());
        System.out.printf("║ Estimated Delivery: %-46d days ║%n", shipping.getEstimatedDays());
        System.out.println("╚═════════════════════════════════════════════════════════════════════╝");
        System.out.println("\n✓ Order placed successfully!");
        System.out.println("Thank you for shopping at TechMart!");
    }
}