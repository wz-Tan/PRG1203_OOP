package lab7;

public class Employee {

    private static double total_salary; // Taking this as combined monthly
    private String name;
    private double salary;

    public Employee() {}

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary >= 0 ? salary : 0;

        // Adding into static
        addTotalSalary(this.salary);
    }

    // Total Salary Operations
    public void addTotalSalary(double amount) {
        total_salary += amount;
    }

    public void decreaseTotalSalary(double amount) {
        total_salary -= amount;
    }

    public static double getTotalSalary() {
        return total_salary * 12;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Custom Functions
    public void increaseSalary(double percentage) {
        // Reset
        decreaseTotalSalary(salary);
        // Add New Value
        salary *= 1 + percentage;
        addTotalSalary(salary);
    }

    public String toString() {
        return String.format(
            "The employee %s is making a yearly salary of %.2f",
            name,
            salary * 12
        );
    }
}
