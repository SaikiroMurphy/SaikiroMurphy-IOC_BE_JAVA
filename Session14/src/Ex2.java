
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        String input;
        int valid, invalid;
        valid = invalid = 0;
        while (true) {
            System.out.print("Nhập vào một số nguyên (hoặc 'exit' để dừng): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            inputs.add(input);
        }

        for (String str : inputs) {
            try {
                int num = Integer.parseInt(str);
                numbers.add(str);
                valid++;
            } catch (NumberFormatException e) {
                invalid++;  
            }
        }
        System.out.println("Số lượng chuỗi hợp lệ: " + valid);
        System.out.println("Số lượng chuỗi không hợp lệ: " + invalid);
        System.out.println("Danh sách chuỗi đã nhập: " + numbers);
    }
}
