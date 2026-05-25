public class lecturew4 {

    public static void main(String[] args) {
        int num = 3;
        int result = factorial(num);
        System.out.println("The result of factorial " + num + " is " + result);
    }

    public static int factorial(int input) {
        // Base Case
        if (input == 1) {
            return 1;
        }

        return input * factorial(input - 1);
    }
}
