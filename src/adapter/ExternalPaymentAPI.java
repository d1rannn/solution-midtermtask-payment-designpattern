package adapter;

public class ExternalPaymentAPI {
    public boolean sendPayment(double amount, String account) {
        System.out.println("[External API] Sending payment of $" + amount + " to account " + account);
        return true;
    }
}