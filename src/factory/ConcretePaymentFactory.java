package factory;

import payment.*;

public class ConcretePaymentFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod(String type) {
        switch (type.toLowerCase()) {
            case "creditcard": return new CreditCardPayment();
            case "paypal": return new PayPalPayment();
            case "crypto": return new CryptoPayment();
            default: throw new IllegalArgumentException("Invalid payment type");
        }
    }


}
