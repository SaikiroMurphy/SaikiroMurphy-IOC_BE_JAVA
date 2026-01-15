import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int quantity, placeHolder;
        int[] arr;

        // Nhập thông tin
        System.out.print("Nhập số lượng phần tử của mảng: ");
        quantity = Integer.parseInt(scanner.nextLine());

        arr = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.printf("Nhập phần tử số %d: ", i+1);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        // Xử lý thông tin
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    placeHolder = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = placeHolder;
                }
            }
            
        }

        // Hiển thị kết quả
        System.out.println("Mảng sau khi sắp xếp giảm dần: " + Arrays.toString(arr));
    }
}
