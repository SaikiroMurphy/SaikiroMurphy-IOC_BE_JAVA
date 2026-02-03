package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Staff {
    int id;
    String name;
    double baseSalary;

    public Staff(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateTotalSalary();

    abstract void inputInfo(Scanner scanner, ArrayList<Staff> staffMembers);

    abstract void updateInfo(Scanner scanner);

    abstract void displayInfo();
}
