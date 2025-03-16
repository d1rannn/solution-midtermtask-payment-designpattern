package payment;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
        return amount <= 1000; // Mock condition: approve payments <= $1000
    }
}