import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {

    public static void displayStatistics (List<Double> scores) {
        if (scores.isEmpty()) {
            System.out.println("Chưa có dữ liệu");
        } else {
            System.out.println("⌈‾‾‾‾‾‾‾‾‾‾‾‾‾‾ KẾT QUẢ ‾‾‾‾‾‾‾‾‾‾‾‾‾⌉");
            System.out.printf("%-2s %-25s %-6d %2s\n", "|", "Số học viên đã nhập: ", scores.size(), "|");
            double average = scores.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            System.out.printf("%-2s %-25s %-6.2f %2s\n", "|", "Điểm trung bình: ", average, "|");
            double max = scores.stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
            System.out.printf("%-2s %-25s %-6.2f %2s\n", "|", "Điểm cao nhất: ", max, "|");
            double min = scores.stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
            System.out.printf("%-2s %-25s %-6.2f %2s\n", "|", "Điểm thấp nhất: ", min, "|");
            System.out.println("⌊____________________________________⌋");

        }
    }

    public static String conductMap (double score) {
        if (score >= 9 && score <= 10) {
            return "Xuất sắc";
        } else if (score >= 8 && score < 9) {
            return "Giỏi";
        } else if (score >= 7 && score < 8) {
            return "Khá";
        } else if (score >= 5 && score < 7) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public static List<Double> insertScore () {
        Scanner scanner = new Scanner(System.in);
        double input;
        List<Double> scores = new ArrayList<>();

        System.out.println("--- Nhập điểm học viên (Nhập -1 để dừng) ---");
            
        do {
            System.out.print("Nhập điểm: ");
            input = Integer.parseInt(scanner.nextLine());
            
            if (input != -1) {
                if(input >=0 && input <= 10) {
                    scores.add(input);
                    System.out.printf("Học lực: %s\n", conductMap(input));
                
                } else {
                    System.out.println("Điểm không hợp lệ. Vui lòng nhập lại.");
                }
            }
        } while (input != -1);

        System.out.println("Thoát chức năng nhập điểm.");
        return scores;
    }

    public static void main(String[] args) throws Exception{
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int selector;
        List<Double> scores = new ArrayList<>();

        do {
            // Menu
            System.out.println("⌈‾‾‾‾‾‾‾‾‾‾‾‾ MENU NHẬP ĐIỂM ‾‾‾‾‾‾‾‾‾‾‾‾⌉");
            System.out.printf("%-2s %-3s %-32s %2s\n", "|", "1.", "Nhập điểm học viên", "|");
            System.out.printf("%-2s %-3s %-32s %2s\n", "|", "2.", "Hiển thị thống kê", "|");
            System.out.printf("%-2s %-3s %-32s %2s\n", "|", "3.", "Thoát", "|");
            System.out.println("⌊________________________________________⌋");
            System.out.print("Nhập lựa chọn của bạn: ");
            selector = Integer.parseInt(scanner.nextLine());

            switch (selector) {
                case 1:
                    scores.addAll(insertScore());
                    break;
                case 2:
                    displayStatistics(scores);
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                    break;
            }
        } while (selector != 3);
        System.exit(0);
    }
}
