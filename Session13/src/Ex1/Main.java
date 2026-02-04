package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        ArrayList<Person> lists = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Menu.mainMenu(scanner, lists);
    }
}
