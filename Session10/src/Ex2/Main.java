package Ex2;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(2, 3);
        Shape s2 = new Circle(1);
        System.out.printf("Area of Rectangle: %.2f%n", s1.area());
        System.out.printf("Area of Circle: %.2f%n", s2.area());
    }
}
