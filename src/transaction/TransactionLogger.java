package transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionLogger {
    private List<Transaction> transactions = new ArrayList<>();

    public void logTransaction(double amount, boolean status) {
        Transaction transaction = new Transaction(amount, status);
        transactions.add(transaction);
        transaction.printTransaction();
    }
}