package lab3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        boolean exceptionOccurred = false;

        for (int i = 0; i < 5; i++) {
            exceptionOccurred = false;
            System.out.println("Please insert a number: ");
            try {
                int n = input.nextInt();
                numbers[i] = n;
            } catch (InputMismatchException e) {
                System.out.println("Please only insert a number");
                exceptionOccurred = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The index is out of bounds");
                exceptionOccurred = true;
            } catch (ArithmeticException e) {
                System.out.println("Can't divide a number with zero");
                exceptionOccurred = true;
            } catch (Exception e) {
                System.out.println("An error occured." + e);
                exceptionOccurred = true;
            }

            if (exceptionOccurred) {
                i--;
                input.nextLine(); // Clear off the input
            }
        }

        System.out.print(Arrays.toString(numbers));
        input.close();
    }
}
