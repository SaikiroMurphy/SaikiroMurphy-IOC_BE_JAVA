
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        System.out.print("Nhập mật khẩu: ");
        password = scanner.nextLine();

        if (isValid(password)) {
            System.out.println("Mật khẩu hợp lệ.");
        } else {
            System.err.println("Mật khẩu không hợp lệ.");
        }
    }

    public static boolean isValid (String password) {
        String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$!%])[A-Za-z\\d@#$!%]{8,}$";
        return Pattern.matches(PASSWORD_REGEX, password);
    }
}
