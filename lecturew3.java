import java.util.ArrayList;
import java.util.Arrays;

public class lecturew3 {

    public static void main(String[] args) {
        // Normal Array for Primitives and Objects, Can Be initialised with {}
        int[] numbers = new int[] {1, 2};

        // Dynamic list, can be expanded, requires objects as the variable type
        ArrayList<Integer> specialNumbers = new ArrayList<>(
            Arrays.asList(1, 2, 3)
        );

        specialNumbers.add(10);

        for (Integer number : specialNumbers) {
            System.out.println(number);
        }
        System.out.println("Result is " + add2Numbers(numbers[0], numbers[1]));
    }

    public static int add2Numbers(int num1, int num2) {
        return num1 + num2;
    }
}
