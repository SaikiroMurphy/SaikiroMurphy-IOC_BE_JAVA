package Ex1;

public class Student {
    private int id, age;
    private String name;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return ("ID: " + this.id 
        + ", Name: " + this.name
        + ", Age: " + this.age);
    }

    public void displayStudentInfo() {
        System.out.println(this);
    }
}
