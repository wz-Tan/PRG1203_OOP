import java.util.Scanner;

public class week1a {

    public static void main(String[] args) {
        exercise3();
    }

    public static void exercise1() {
        Scanner obj = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        for (int i = 1; i < 4; i++) {
            System.out.printf("\nEnter number %d : ", i);
            int input = obj.nextInt();
            if (i == 1) {
                num1 = input;
            } else if (i == 2) {
                num2 = input;
            } else {
                num3 = input;
            }
        }

        int sum = num1 + num2 + num3;

        System.out.printf("For the numbers %d, %d, and %d\n", num1, num2, num3);
        System.out.println(
            "Largest number is " + Math.max(Math.max(num1, num2), num3)
        );
        System.out.println(
            "Smallest number is " + Math.min(Math.min(num1, num2), num3)
        );

        System.out.println("Sum is " + sum);
        System.out.println("Product is " + (num1 * num2 * num3));
        System.out.println("Average is " + (sum / 3));

        obj.close();
    }

    public static void exercise2() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a 5 digit number: ");
        int num = obj.nextInt();
        String numString = String.valueOf(num);
        System.out.printf(
            "Digits in %d are %s %s %s %s %s",
            num,
            numString.charAt(0),
            numString.charAt(1),
            numString.charAt(2),
            numString.charAt(3),
            numString.charAt(4)
        );

        obj.close();
    }

    public static void exercise3() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int num = obj.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
        obj.close();
    }
}
