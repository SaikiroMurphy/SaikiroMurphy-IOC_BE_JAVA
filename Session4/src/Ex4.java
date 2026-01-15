import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int quantity, idx = 0;
        int[] arr, newArr;

        // Nhập thông tin
        System.out.print("Nhập số lượng phần tử của mảng: ");
        quantity = Integer.parseInt(scanner.nextLine());

        arr = new int[quantity];
        newArr = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.printf("Nhập phần tử số %d: ", i + 1);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        // Xử lý thông tin
        for (int i : arr) {
            if (i % 2 == 0) {
                newArr[idx++] = i;
            }
        }

        for (int i : arr) {
            if (i % 2 != 0) {
                newArr[idx++] = i;
            }
        }

        // Hiển thị kết quả
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(newArr));
    }
}
