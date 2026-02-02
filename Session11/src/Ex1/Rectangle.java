package Ex1;

public class Rectangle extends Shape implements Drawable{

    private double width;
    private double height;
    
    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("Đây là hình chữ nhật có tên " + this.name + " với chiều rộng là " + this.width + " và chiều cao là " + this.height);
    }
    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return width * height;
    }
    @Override
    double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * (width + height);
    }
    @Override
    void displayInfo() {
        // TODO Auto-generated method stub
        System.out.printf("Hình chữ nhật %s:\n\t Chiều rộng: %.1f\n\t Chiều cao: %.1f\n\t Chu vi: %.1f\n\t Diện tích: %.1f\n", this.name, this.width, this.height, this.getPerimeter(), this.getArea());
    }

    
}
