package Ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        ArrayList<String> validPhoneNumbers = new ArrayList<>();
        ArrayList<String> invalidPhoneNumbers = new ArrayList<>();

        System.out.print("Nhập chuỗi các số điện thoại (cách nhau bằng dấu phẩy):");
        input = scanner.nextLine();
        String[] phoneNumbers = input.split(",");
        for (String phoneNumber : phoneNumbers) {
            try {
                InvalidPhoneNumberLengthException.validatePhoneNumber(phoneNumber);
                validPhoneNumbers.add("- " + phoneNumber);
            } catch (InvalidPhoneNumberLengthException e) {
                invalidPhoneNumbers.add("- " + phoneNumber + "\t: " + e.getMessage());
            }
        }
        System.out.println("Các số điện thoại hợp lệ:");
        for (String phoneNumber : validPhoneNumbers) {
            System.out.println(phoneNumber);
        }
        System.out.println("Các số điện thoại không hợp lệ:");
        for (String phoneNumber : invalidPhoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
}
