package Ex4;

public class Main {
    public static void main(String[] args) {
        double maxArea;

        Rectangle r1 = new Rectangle(3, 4);
        System.out.println(r1);
        Rectangle r2 = new Rectangle(5, 2);
        System.out.println(r2);
        Rectangle r3 = new Rectangle(4.5, 3.5);
        System.out.println(r3);

        maxArea = Math.max(r1.area(), Math.max(r2.area(), r3.area()));
        System.out.println("The maximum area is: " + maxArea);
    }
}
