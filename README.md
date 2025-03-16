# Online Payment Gateway

## Overview
The **Online Payment Gateway** is a payment processing system that supports multiple payment methods, including **Credit Card, PayPal, and Cryptocurrency**. This project demonstrates the **Factory Method** and **Adapter** design patterns while integrating a mock external API.

## Design Patterns Implemented

### 1. Factory Method Pattern
- The `PaymentMethod` interface defines a standard contract for all payment methods.
- `CreditCardPayment`, `PayPalPayment`, and `CryptoPayment` implement this interface.
- `PaymentFactory` is an abstract class defining the factory method.
- `ConcretePaymentFactory` dynamically creates the correct payment object based on the provided input.

### 2. Adapter Pattern
- The project integrates a mock external API for PayPal transactions.
- `ExternalPaymentAPI` simulates communication with an external payment service.
- `PayPalAdapter` wraps the external API and adapts it to the `PaymentMethod` interface, allowing seamless integration.

## Project Structure

```
OnlinePaymentGateway/
│── src/
│   ├── payment/
│   │   ├── PaymentMethod.java
│   │   ├── CreditCardPayment.java
│   │   ├── PayPalPayment.java
│   │   ├── CryptoPayment.java
│   ├── factory/
│   │   ├── PaymentFactory.java
│   │   ├── ConcretePaymentFactory.java
│   ├── adapter/
│   │   ├── ExternalPaymentAPI.java
│   │   ├── PayPalAdapter.java
│   ├── transaction/
│   │   ├── Transaction.java
│   │   ├── TransactionLogger.java
│   ├── Main.java
│── README.md
```


## Features
- Supports three payment methods: **Credit Card, PayPal, and Cryptocurrency**.
- Uses the **Factory Method** pattern to instantiate different payment methods dynamically.
- Uses the **Adapter** pattern to integrate an external PayPal API.
- Logs transaction history, including amount and status.
- Handles basic error cases like insufficient funds.

## How to Run
1. Compile all Java files using:
   ```sh
   javac src/**/*.java

	2.	Run the application:

java src.Main



Demo Functionality
	•	The user selects a payment method.
	•	If PayPal is selected, the user enters a PayPal account.
	•	The system processes the payment and logs the transaction status (successful or failed).
	•	The user can review past transactions.

Future Enhancements
	•	Implement additional payment methods like Bank Transfers.
	•	Add GUI-based interface for better user experience.
	•	Support real external payment APIs.
	•	Implement a refund feature.

⸻
