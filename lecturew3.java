public class lecturew3 {

    public static void main(String[] args) {
        System.out.println(args[0]);
        int num1 = 2;
        int num2 = 5;
        System.out.println("Result is " + add2Numbers(num1, num2));
    }

    public static int add2Numbers(int num1, int num2) {
        int result = num1 * num2;
        return num1 + num2;
    }
}
