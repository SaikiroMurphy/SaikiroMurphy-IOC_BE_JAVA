package Ex6;

import java.util.Scanner;

public class Truck extends MotorVehichle {
    @Override
    public void startEngine() {
        System.out.println(super.getBrand() + "'s (Truck) engine rumbles as it starts!");
    }

    public void loadCargo() {
        System.out.println("The " + super.getBrand() + "'s (Truck) is now loaded with cargo.");
    }

    @Override
    public void inputInfo(Scanner scanner) {
        super.inputInfo(scanner);
        // Additional input for Truck can be added here if needed
    }
}
