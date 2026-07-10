package lab6;

public class Account {

    private static double total;
    private double balance;

    public Account() {}

    public Account(double initialBalance) {
        this.balance = initialBalance;
        increaseTotal(initialBalance);
    }

    public void credit(double amount) {
        balance += amount;
        increaseTotal(amount);
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("There is not enough balance to be debited. ");
        } else {
            balance -= amount;
            decreaseTotal(amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    // Total
    public void increaseTotal(double amount) {
        total += amount;
    }

    public void decreaseTotal(double amount) {
        total -= amount;
    }

    public static double getTotal() {
        return total;
    }
}
