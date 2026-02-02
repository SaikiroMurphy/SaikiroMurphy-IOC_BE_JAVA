package Ex1;

public class Circle extends Shape implements Drawable{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("Đây là hình tròn có tên " + this.name + " với bán kính là " + this.radius);
    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * Math.PI *radius;
    }

    @Override
    void displayInfo() {
        // TODO Auto-generated method stub
        System.out.printf("Hình tròn %s:\n\t Bán kính: %.1f\n\t Chu vi: %.1f\n\t Diện tích: %.1f\n", this.name, this.radius, this.getPerimeter(), this.getArea());
    }
    
}
