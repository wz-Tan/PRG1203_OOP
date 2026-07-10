package lab6;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account1 = new Account(50.00);
        Account account2 = new Account(8.93);

        // Init
        System.out.printf("account1 balance: $%.2f \n", account1.getBalance());

        System.out.printf("account2 balance: $%.2f \n", account2.getBalance());

        // Debit
        System.out.println("Enter amount to be deposited for account1: ");
        account1.credit(scanner.nextDouble());

        System.out.println("Enter amount to be deposited for account2: ");
        account2.credit(scanner.nextDouble());

        System.out.printf("account1 balance: $%.2f \n", account1.getBalance());

        System.out.printf("account2 balance: $%.2f \n", account2.getBalance());

        // Credit
        System.out.println("Enter amount to be withdrawn from account1: ");
        account1.debit(scanner.nextDouble());

        System.out.println("Enter amount to be withdrawn from account2: ");
        account2.debit(scanner.nextDouble());

        System.out.printf("account1 balance: $%.2f \n", account1.getBalance());

        System.out.printf("account2 balance: $%.2f \n", account2.getBalance());

        System.out.printf("Total amount is: $%.2f \n", Account.getTotal());
    }
}
