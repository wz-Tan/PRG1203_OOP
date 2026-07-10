package lab8;

import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        int month;
        int year;
        int totalDays;
        String monthName;

        while (true) {
            try {
                int dateTimeFormat = getMenuChoice(scanner);
                if (dateTimeFormat == 4) {
                    return;
                }

                switch (dateTimeFormat) {
                    case 1:
                        System.out.println("Please insert the day in integer");
                        day = scanner.nextInt();

                        System.out.println(
                            "Please insert the month in integer"
                        );
                        month = scanner.nextInt();

                        System.out.println("Please insert the year in integer");
                        year = scanner.nextInt();

                        Date date = new Date(day, month, year);
                        System.out.println(date);
                        System.out.println(date.toMonthNameDateString());
                        System.out.println(date.toDayDateString());
                        break;
                    case 2:
                        scanner.nextLine(); // Eat The Next Line
                        System.out.println("Please insert the month name");
                        monthName = scanner.nextLine();

                        System.out.println("Please insert the day in integer");
                        day = scanner.nextInt();

                        System.out.println("Please insert the year in integer");
                        year = scanner.nextInt();

                        Date date2 = new Date(monthName, day, year);
                        System.out.println(date2);
                        System.out.println(date2.toMonthNameDateString());
                        System.out.println(date2.toDayDateString());
                        break;
                    case 3:
                        System.out.println(
                            "Please insert the total days in integer"
                        );
                        totalDays = scanner.nextInt();

                        System.out.println("Please insert the year in integer");
                        year = scanner.nextInt();

                        Date date3 = new Date(totalDays, year);
                        System.out.println(date3);
                        System.out.println(date3.toMonthNameDateString());
                        System.out.println(date3.toDayDateString());
                        break;
                }
            } catch (Exception e) {
                System.err.println(
                    "An error occurred. Please Try Again.\n" + e.getMessage()
                );
                scanner.nextLine();
            }
        }
    }

    public static int getMenuChoice(Scanner scanner) {
        System.out.println(
            "Please select a date time format, from 1 to 3. Input 4 to exit."
        );
        int choice = scanner.nextInt();
        return choice;
    }
}
