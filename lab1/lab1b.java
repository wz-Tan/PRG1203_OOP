package lab1;
import java.util.Scanner;

public class lab1b {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int choice = -1;
        int currQuantity = 0;
        int quantity1 = 0;
        int quantity2 = 0;
        int quantity3 = 0;
        double price1 = 2.98;
        double price2 = 4.50;
        double price3 = 9.98;

        while (choice != 0) {
            System.out.println("Enter product number (1-3) (0 to stop): ");
            choice = obj.nextInt();

            if (choice == 1 || choice == 2 || choice == 3) {
                System.out.println("Enter quantity sold: ");
                currQuantity = obj.nextInt();

                // Conditioning
                switch (choice) {
                    case 1:
                        quantity1 += currQuantity;
                    case 2:
                        quantity2 += currQuantity;
                    case 3:
                        quantity3 += currQuantity;
                    default:
                    // Do Nothing
                }
            }
        }

        System.out.printf("Product 1: $%.2f \n", (price1 * quantity1));
        System.out.printf("Product 2: $%.2f \n", (price2 * quantity2));
        System.out.printf("Product 3: $%.2f \n", (price3 * quantity3));

        obj.close();
    }
}
