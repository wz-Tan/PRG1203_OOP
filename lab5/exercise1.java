package lab5;

public class exercise1 {

    public static void main(String[] args) {
        Student student1 = new Student("Alex", 5, "BCS");
        Student student2 = new Student("Mindy", 2, "IT");

        student1.setName("Johnson");
        System.out.println(student1);
        System.out.println("Is he eligible? " + student1.isEligible());
    }
}
