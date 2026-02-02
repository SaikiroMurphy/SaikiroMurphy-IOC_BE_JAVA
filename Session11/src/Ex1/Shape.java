package Ex1;

public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double getArea();

    abstract double getPerimeter();

    abstract void displayInfo();
}
