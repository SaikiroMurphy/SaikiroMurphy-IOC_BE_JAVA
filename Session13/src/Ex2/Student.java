package Ex2;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập ID sinh viên: ");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sinh viên: ");
        this.name = scanner.nextLine();
    }

    public String toString() {
        return "id=" + id + ", Họ tên='" + name + "';";
    }
}
