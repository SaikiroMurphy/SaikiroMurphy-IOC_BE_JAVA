package Ex1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        Shape c1 = new Circle("Hình tròn thứ nhất", 5.0);
        Shape r1 = new Rectangle("Hình chữ nhật thứ nhất", 4.0, 6.0);
        Shape c2 = new Circle("Hình tròn thứ hai", 3.0);
        shapes[0] = c1;
        shapes[1] = r1;
        shapes[2] = c2;
        
        for (Shape shape : shapes) {
            if (shape != null) {
                shape.displayInfo();
                if (shape instanceof Drawable) {
                    Drawable drawable = (Drawable) shape;
                    drawable.draw();
                }
            }
        }
    }
}
