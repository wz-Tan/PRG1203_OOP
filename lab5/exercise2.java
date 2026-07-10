package lab5;

import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) {
        tv TV1 = new tv("S101", "Elba", 'R', 1400);
        System.out.println("The original price is " + TV1.getPrice());

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the new price?");
        TV1.setPrice(scanner.nextDouble());

        System.out.println("The new price is " + TV1.getPrice());
        scanner.close();
    }
}
