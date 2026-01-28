package Ex6;

import java.util.Scanner;

public class Car extends MotorVehichle {
    @Override
    public void startEngine() {
        System.out.println(super.getBrand() + "'s (Car) engine roars to life!");
    }

    public void openTrunk() {
        System.out.println("The " + super.getBrand() + "'s (Car) trunk is now open.");
    }

    @Override
    public void inputInfo(Scanner scanner) {
        super.inputInfo(scanner);
        // Additional input for Car can be added here if needed
    }
}
