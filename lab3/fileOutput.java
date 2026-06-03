package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileOutput {

    public static void main(String[] args) {
        Scanner input;
        try {
            input = new Scanner(new File("clients.txt"));
            while (input.hasNext()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file");
        }
    }
}
