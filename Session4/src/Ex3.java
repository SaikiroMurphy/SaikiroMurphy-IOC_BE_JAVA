import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int quantity, placeHolder, findNumber, left, right, mid;
        int[] arr;

        // Nhập mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        quantity = Integer.parseInt(scanner.nextLine());

        arr = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.printf("Nhập phần tử số %d: ", i+1);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }


        // Sắp xếp mảng (DESC)
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    placeHolder = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = placeHolder;
                }
            }
            
        }

        // Hiển thị mảng sau sắp xếp
        System.out.println("Mảng sau khi sắp xếp giảm dần: " + Arrays.toString(arr));
    
        // Tìm số trong mảng
        System.out.print("Nhập số cần tìm: ");
        findNumber = Integer.parseInt(scanner.nextLine());

        // Tìm kiếm tuyến tính
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findNumber) {
                System.out.println("Tìm kiếm tuyến tính: Số " + findNumber + " có tại vị trí " + i);
                break;
            }
        }

        // Tìm kiếm nhị phân
        left = 0;
        right = arr.length - 1;
        while (left <= right) { 
            mid = (left + right) / 2;

            if (arr[mid] == findNumber) {
                System.out.println("Tìm kiếm nhị phân: Số " + findNumber + " có tại vị trí " + mid);
                break;
            } else if (findNumber < arr[mid]) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
    }
}
