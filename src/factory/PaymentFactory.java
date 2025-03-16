package factory;

import payment.PaymentMethod;

public abstract class PaymentFactory {
    public abstract PaymentMethod createPaymentMethod(String type);
}