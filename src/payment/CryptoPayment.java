package payment;

public class CryptoPayment implements PaymentMethod {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment: $" + amount);
        return true; // Assume all crypto payments are valid
    }
}