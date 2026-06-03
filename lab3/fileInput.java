package lab3;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class fileInput {

    public static void main(String[] args) {
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

                // Add Data In 
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
}
