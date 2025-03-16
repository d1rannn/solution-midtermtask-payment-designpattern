package payment;

public interface PaymentMethod {
    boolean processPayment(double amount);
}