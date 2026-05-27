import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) {
        exercise4();
    }

    public static void exercise1() {
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

    public static void exercise2() {
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

    public static void exercise3() {
        Scanner input = new Scanner(System.in);
        Formatter output;

        try {
            output = new Formatter("clients.txt");

            while (true) {
                System.out.println(
                    "Please insert student name. Or, press Ctrl+Z (Windows) or Ctrl+D (Mac/Linux) to exit ."
                );
                if (!input.hasNext()) {
                    break;
                }

                String studentName = input.nextLine();

                System.out.print("Please insert student marks: ");
                while (!input.hasNextInt()) {
                    // validate marks input
                    System.out.print(
                        "Invalid! Please insert a number for marks: "
                    );
                    input.next();
                }
                int marks = input.nextInt();

                output.format("%s: %d Marks%n", studentName, marks);
                System.out.println("Record saved.\n");

                input.nextLine(); // cleanup
            }
        } catch (FileNotFoundException e) {
            System.err.println("Failed creating file");
            return;
        }
        output.close();
        input.close();
        System.out.println("Done! Data saved to clients.txt.");
    }

    public static void exercise4() {
        Scanner input;
        try {
            input = new Scanner(new File("clients.txt"));
            while (input.hasNext()) {
                System.err.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file");
        }
    }
}
