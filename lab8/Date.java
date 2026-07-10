package lab8;

public class Date {

    private int day;
    private int month;
    private int year;
    private String monthName;
    private int totalDays;

    // Constructors
    public Date() {}

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        setMonthName(month);
        setTotalDays(day, month);
        checkDataValid(day, month, year, monthName, totalDays);
    }

    public Date(String monthName, int day, int year) {
        this.monthName = monthName;
        this.day = day;
        this.year = year;
        setMonthNum(monthName);
        setTotalDays(day, this.month);
        checkDataValid(day, month, year, monthName, totalDays);
    }

    public Date(int totalDays, int year) {
        this.totalDays = totalDays;
        this.year = year;
        setDayAndMonth(totalDays);
        setMonthName(this.month);
        checkDataValid(day, month, year, monthName, totalDays);
    }

    // Utilities
    private void setMonthName(int monthNum) {
        String[] monthNames = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December",
        };
        try {
            this.monthName = monthNames[monthNum - 1];
        } catch (Exception e) {
            this.monthName = "";
        }
    }

    private void setMonthNum(String monthName) {
        String[] monthNames = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December",
        };

        int counter = 1;
        for (String name : monthNames) {
            if (monthName.equalsIgnoreCase(name)) {
                this.month = counter;
                return;
            }
            counter++;
        }

        this.month = 0;
    }

    private void setTotalDays(int day, int month) {
        this.totalDays = month * 30 + day;
    }

    private void setDayAndMonth(int totalDays) {
        this.day = totalDays % 30;
        this.month = totalDays / 30;
    }

    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
    }

    public String toMonthNameDateString() {
        return String.format("%s %02d,%d", monthName, day, year);
    }

    public String toDayDateString() {
        return String.format("%d %d", totalDays, month);
    }

    private void checkDataValid(
        int day,
        int month,
        int year,
        String monthName,
        int totalDays
    ) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day is not valid");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month is not valid");
        }
        if (year < 1900 || month > 2100) {
            throw new IllegalArgumentException("Year is not valid");
        }
        if (monthName.equals("")) {
            throw new IllegalArgumentException("Month name is not valid");
        }
        if (totalDays < 0 || totalDays > 366) {
            throw new IllegalArgumentException("Total Days is not valid");
        }
    }
}
