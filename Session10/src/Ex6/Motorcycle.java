package Ex6;

import java.util.Scanner;

public class Motorcycle extends MotorVehichle {
    @Override
    public void startEngine() {
        System.out.println(super.getBrand() + "'s (Motorcycle) engine vrooms as it starts!");
    }

    public void popWheelie() {
        System.out.println("The " + super.getBrand() + "'s (Motorcycle) pops a wheelie!");
    }

    @Override
    public void inputInfo(Scanner scanner) {
        super.inputInfo(scanner);
        // Additional input for Motorcycle can be added here if needed
    }
}
