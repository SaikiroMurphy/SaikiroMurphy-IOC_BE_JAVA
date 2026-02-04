package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    private String name;
    private String email;
    private String phone;
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    public Person() {
    }

    public Person(String email, String name, String phone) {
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
 
    public static void inputData(Scanner scanner, ArrayList<Person> lists) {
        Person p = new Person();

        System.out.print("Nhập tên người dùng: ");
        String nameInput = scanner.nextLine();
        while (nameInput.isEmpty()) {
            System.out.print("Tên không được để trống. Vui lòng nhập lại: ");
            nameInput = scanner.nextLine();
        }
        p.setName(nameInput);

        System.out.print("Nhập email người dùng: ");
        String emailInput = scanner.nextLine();
        while (!checkLegitEmail(emailInput, lists)) {
            emailInput = scanner.nextLine();
        }       
        p.setEmail(emailInput);

        System.out.print("Nhập số điện thoại người dùng: ");
        String phoneInput = scanner.nextLine();
        while (phoneInput.isEmpty()) {
            System.out.print("Số điện thoại không được để trống. Vui lòng nhập lại: ");
            phoneInput = scanner.nextLine();
        }
        p.setPhone(phoneInput);

        lists.add(p);
    }

    public static void displayData(ArrayList<Person> lists) {
        if (lists.isEmpty()) {
            System.out.println("Danh sách người dùng trống.");
            return;
        }

        System.out.println("+=========================== DANH SÁCH NGƯỜI DÙNG ========================+");
        System.out.printf("| %-20s | %-30s | %-15s |\n", "Tên", "Email", "Số điện thoại");
        for (Person p : lists) {
            System.out.println("+----------------------+--------------------------------+-----------------+");
            System.out.printf("| %-20s | %-30s | %-15s |\n", p.getName(), p.getEmail(), p.getPhone());
        }
        System.out.println("+=========================================================================+");
    }

    public static void deleteData(Scanner scanner, ArrayList<Person> lists) {
        if (lists.isEmpty()) {
            System.out.println("Danh sách người dùng trống.");
            return;
        }

        System.out.print("Nhập email người dùng cần xóa: ");
        String emailToDelete = scanner.nextLine();
        while (emailToDelete.isEmpty()) {
            System.out.print("Email không được để trống. Vui lòng nhập lại: ");
            emailToDelete = scanner.nextLine();
        }
        boolean found = false;
        for (Person p : lists) {
            if (p.getEmail().equals(emailToDelete)) {
                lists.remove(p);
                found = true;
                System.out.println("Đã xóa người dùng " + p.getName() + " với email: " + emailToDelete);
                break;
            }
        }
        if (!found) {
            System.err.println("Không tìm thấy người dùng với email: " + emailToDelete);
        }
    }

    private static boolean checkLegitEmail(String emailInput, ArrayList<Person> lists) {
         if (emailInput.isEmpty()) {
            System.err.print("Email không được để trống. Vui lòng nhập lại: ");
            return false;

        } else if (!emailInput.matches(EMAIL_REGEX)) {
            System.err.print("Email không hợp lệ. Vui lòng nhập lại: ");
            return false;
            
        } else{
            for (Person p : lists) {
                if (p.getEmail().equals(emailInput)) {
                    System.err.print("Email đã tồn tại. Vui lòng nhập lại: ");
                    return false;
                }
            }

            return true;
        }
    }
}
