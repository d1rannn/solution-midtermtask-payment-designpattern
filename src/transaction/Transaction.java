package transaction;

public class Transaction {
    private static int counter = 1;
    private int id;
    private double amount;
    private boolean status;

    public Transaction(double amount, boolean status) {
        this.id = counter++;
        this.amount = amount;
        this.status = status;
    }

    public void printTransaction() {
        System.out.println("Transaction " + id + ": Amount: $" + amount + " - Status: " + (status ? "Completed" : "Failed"));
    }
}