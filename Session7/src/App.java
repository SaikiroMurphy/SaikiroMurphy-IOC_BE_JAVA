public class App {
    public static void main(String[] args) throws Exception {
        Product p1 = new Product("A cool gadget", "P001", "Gadget", 99, true, 50);
        p1.displayInfo();
        Product p2 = new Product();
        p2.inputData();
        p2.displayInfo();
    }
}
