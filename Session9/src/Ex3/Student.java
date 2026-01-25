package Ex3;

public class Student {
    private String id;
    private String fullName;
    private int age;
    private double gpa;
    private static int count = 0;
    private final double MIN_GPA = 0.0;
    private final double MAX_GPA = 4.0;

    public Student(String id, String fullName, int age, double gpa) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
        count++;
    }

    public String getFullName() {
        return fullName;
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return id;
    }

    public void setStudentId(String id) {
        this.id = id;
    }

    public void printInfo() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Student Name: " + this.fullName);
        System.out.println("Age: " + this.age);
        System.out.println("GPA: " + this.gpa);
    }

    public static int getCount() {
        return count;
    }
}
