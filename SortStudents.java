import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortStudents {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String currInput = "";
        ArrayList<String> nameList = new ArrayList<String>();
        boolean validName = false;

        // Input Loop
        while (true) {
            validName = true;
            System.out.print("\nEnter name (-1 to end loop): ");
            currInput = obj.nextLine();

            if (currInput.equals("-1")) break;

            if (nameList.contains(currInput)) {
                System.out.println("Name already exists!");
                continue;
            }

            if (validName) nameList.add(currInput);
        }

        // Logic (Comparison of Names)
        Collections.sort(nameList);
        for (String name : nameList) {
            System.out.print(name + " ");
        }

        // Remove Names
        while (true) {
            System.out.print("\nEnter name to remove (-1 to end loop): ");
            currInput = obj.nextLine();

            if (currInput.equals("-1")) break;

            // Feedback Message
            if (nameList.remove(currInput)) {
                System.out.println("Successfully Removed " + currInput);
            } else {
                System.out.println("Did not find a match!");
            }
        }

        for (String name : nameList) {
            System.out.print(name + " ");
        }

        int index = 0;

        // Search Names
        while (true) {
            System.out.print("\nSearch for a name (-1 to end loop): ");
            currInput = obj.nextLine();

            if (currInput.equals("-1")) break;

            index = Collections.binarySearch(nameList, currInput);

            // Feedback Message
            if (index >= 0) {
                System.out.println(
                    "The name " + currInput + " is at index " + index
                );
            } else {
                System.out.println("Did not find a match!");
            }

            for (String name : nameList) {
                System.out.print(name + " ");
            }
        }

        obj.close();
    }
}
