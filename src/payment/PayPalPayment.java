package payment;

public class PayPalPayment implements PaymentMethod {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
        return amount <= 500; // Mock condition: approve payments <= $500
    }
}