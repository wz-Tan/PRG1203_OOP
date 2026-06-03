import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {
        exercise1_followup();
    }

    public static void exercise1() {
        Scanner obj = new Scanner(System.in);
        int currInput;

        // Init with All Zeros
        int[] numArray = new int[5];
        int counter = 0;
        boolean validNumber = true;
       

        while (counter < 5) {
            validNumber = true;

            System.out.print("\nEnter number: ");
            currInput = obj.nextInt();

            // Within Range
            if (currInput < 10 || currInput > 100) {
                System.out.println("Number should be between 10 and 100.");
                validNumber = false;
            }

            // Check for Dupes
            for (int i = 0; i < counter; i++) {
                int num = numArray[i];
                if (num == currInput) {
                    System.out.println(
                        "Number is a duplicate of previous inputs"
                    );
                    validNumber = false;
                    break;
                }
            }

            if (validNumber) {
                // Successful Assignment and Logging
                numArray[counter] = currInput;
                for (int i = 0; i <= counter; i++) {
                    System.out.print(numArray[i] + " ");
                }
                counter++;
            }
        }

        obj.close();
    }

    public static void exercise1_followup() {
        Scanner obj = new Scanner(System.in);
        int currInput;

        // Ask How Many Elements
        System.out.print("\nEnter array size: ");
        int arraySize = obj.nextInt();

        // Init with All Zeros
        int[] numArray = new int[arraySize];
        int counter = 0;
        boolean validNumber = true;

        while (counter < arraySize) {
            validNumber = true;

            System.out.print("\nEnter number: ");
            currInput = obj.nextInt();

            // Within Range
            if (currInput < 10 || currInput > 100) {
                System.out.println("Number should be between 10 and 100.");
                validNumber = false;
            }

            // Check for Dupes
            for (int i = 0; i < counter; i++) {
                int num = numArray[i];
                if (num == currInput) {
                    System.out.println(
                        "Number is a duplicate of previous inputs"
                    );
                    validNumber = false;
                    break;
                }
            }

            if (validNumber) {
                // Successful Assignment and Logging
                numArray[counter] = currInput;
                for (int i = 0; i <= counter; i++) {
                    System.out.print(numArray[i] + " ");
                }
                counter++;
            }
        }

        obj.close();
    }
}
