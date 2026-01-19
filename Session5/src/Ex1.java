
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.print("Nhập email: ");
        input = scanner.nextLine();

        input = input.replace(" ", "");
        if (isMatch(input)) {
            System.out.println("Email hợp lệ.");
        } else {
            System.err.println("Email không hợp lệ.");  
        }
    }

    public static boolean isMatch (String input) {
        String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return Pattern.matches(EMAIL_REGEX, input);
    }
}
