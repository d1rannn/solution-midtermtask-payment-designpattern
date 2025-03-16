package adapter;

import payment.PaymentMethod;

public class PayPalAdapter implements PaymentMethod {
    private ExternalPaymentAPI externalAPI;
    private String account;

    public PayPalAdapter(String account) {
        this.externalAPI = new ExternalPaymentAPI();
        this.account = account;
    }

    @Override
    public boolean processPayment(double amount) {
        return externalAPI.sendPayment(amount, account);
    }
}