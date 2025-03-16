import factory.*;
import payment.*;
import transaction.*;
import adapter.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransactionLogger logger = new TransactionLogger();

        System.out.println("Select payment method: CreditCard, PayPal, Crypto");
        String choice = scanner.nextLine();

        PaymentFactory factory = new ConcretePaymentFactory();
        PaymentMethod paymentMethod;

        if (choice.equalsIgnoreCase("paypal")) {
            System.out.println("Enter PayPal account:");
            String account = scanner.nextLine();
            paymentMethod = new PayPalAdapter(account);
        } else {
            paymentMethod = factory.createPaymentMethod(choice);
        }

        System.out.println("Enter payment amount:");
        double amount = scanner.nextDouble();
        boolean status = paymentMethod.processPayment(amount);
        logger.logTransaction(amount, status);
    }
}
