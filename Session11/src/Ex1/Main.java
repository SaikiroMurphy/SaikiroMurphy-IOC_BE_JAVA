package Ex1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        Circle c1 = new Circle("Hình tròn thứ nhất", 5.0);
        Rectangle r1 = new Rectangle("Hình chữ nhật thứ nhất", 4.0, 6.0);
        Circle c2 = new Circle("Hình tròn thứ hai", 3.0);
        shapes[0] = c1;
        shapes[1] = r1;
        shapes[2] = c2;
        
        for (Shape shape : shapes) {
            if (shape != null) {
                shape.displayInfo();
                if (shape instanceof Drawable drawable) {
                    drawable.draw();
                }
            }
        }
    }
}
