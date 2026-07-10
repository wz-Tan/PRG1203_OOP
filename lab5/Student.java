package lab5;

public class Student {

    private String name;
    private int semester;
    private String course;

    public Student() {}

    public Student(String name, int semester, String course) {
        this.name = name;
        this.semester = semester;
        this.course = course;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public String getCourse() {
        return course;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public boolean isEligible() {
        return semester >= 4 && semester <= 6;
    }

    public String toString() {
        return (
            "Student with name " +
            name +
            " studies course " +
            course +
            " in semester " +
            semester
        );
    }
}
