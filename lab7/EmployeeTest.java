package lab7;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("QiWen", 200);
        Employee employee2 = new Employee("Darren", 100);

        System.out.println(employee1);
        System.out.println(employee2);

        employee1.increaseSalary(0.1);
        employee2.increaseSalary(0.1);

        System.out.println(employee1);
        System.out.println(employee2);

        System.out.printf("Total salary is %.2f", Employee.getTotalSalary());
    }
}
