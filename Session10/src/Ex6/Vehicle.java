package Ex6;

import java.util.Scanner;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public Vehicle() {
    }

    

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showInfo() {
        System.out.printf("| %-30s | %-30s |\n", "Brand: ", brand);
        System.out.printf("| %-30s | %-30s |\n", "Year: ", year);
    }

    public void startEngine() {
        System.out.println("The engine has started.");
    }

    public void move() {
        System.out.println("The vehicle is moving.");
    }

    public void move(int speed) {
        System.out.println("The vehicle is moving at " + speed + " km/h.");
    }

    public void inputInfo(Scanner scanner) {
        System.out.print("Nhập thương hiệu: ");
        this.brand = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        this.year = Integer.parseInt(scanner.nextLine());
    }
}
