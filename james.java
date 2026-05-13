import java.util.Scanner;

public class james {

    public static void main(String[] args) {
        System.out.println("Hello worldl! What is your name? ");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        System.out.println("Hey " + username);
        input.close();
    }
}
