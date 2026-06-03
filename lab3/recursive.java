package lab3;

import java.util.Scanner;

public class recursive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert a number: ");
        int n = input.nextInt();
        System.out.print("\n The sum for the number is " + sum(n));
        input.close();
    }

    public static int sum(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        return n + sum(n - 1);
    }
}
