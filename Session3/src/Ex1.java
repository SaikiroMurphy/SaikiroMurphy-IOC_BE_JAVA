import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        String customerName, productName;
        int unitPrice, quantity, totalPrice, finalPrice, membershipSale, VAT;
        double VATPercent = 0.08, membershipSalePercent = 0.1;
        boolean membership;

        // Nhập thông tin
        System.out.println("========== NHẬP THÔNG TIN HÓA ĐƠN ==========");
        System.out.print("Nhập tên khách hàng: ");
        customerName = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        productName = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        unitPrice = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số lượng: ");
        quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Khách có thẻ thành viên? (true/false): ");
        membership = Boolean.parseBoolean(scanner.nextLine());

        // Xử lý thông tin
        totalPrice = unitPrice * quantity;

        if (membership) {
            membershipSale = (int) (totalPrice * membershipSalePercent);
        } else {
            membershipSale = 0;
        }

        VAT = (int) (totalPrice * VATPercent);

        finalPrice = totalPrice - membershipSale + VAT;

        // Hiển thị kết quả
        System.out.println("================== HÓA ĐƠN ==================");
        System.out.printf("%-26s %-30s\n", "Khách hàng: ", customerName);
        System.out.printf("%-26s %-30s\n", "Sản phẩm: ", productName);
        System.out.printf("%-26s %-30s\n", "Số lượng: ", quantity);
        System.out.printf("%-26s %,-30d\n", "Đơn giá: ", unitPrice);
        System.out.printf("%-26s %,-30d\n", "Thành tiền: ", totalPrice);
        System.out.printf("%-26s %,-30d\n", "Giảm giá thành viên (10%):", membershipSale);
        System.out.printf("%-26s %,-30d\n", "Tiền VAT (8%): ", VAT);
        System.out.printf("%-26s %,-30d\n", "Tổng thanh toán: ", finalPrice);
        System.out.println("=============================================");

        scanner.close();
    }
}
