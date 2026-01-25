package Ex3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("S001", "Alice Johnson", 20, 3.5));
        students.add(new Student("S002", "Bob Smith", 22, 3.8));
        students.add(new Student("S003", "Charlie Brown", 19, 3.2));

        System.out.println("----- Student Information -----");
        for (Student student : students) {
            student.printInfo();
            System.out.println("------------------------------");
        }
        System.out.println("Total number of students: " + Student.getCount()); // Hoặc sử dụng students.size()
        // System.out.println("Total number of students: " + students.size());
    }
}
