package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieManager manager = new MovieManager();
        int choice;

        while (true) {
            System.out.println("+--- Quản lý phim ---+");
            System.out.println("1. Thêm phim");
            System.out.println("2. Xóa phim");
            System.out.println("3. Cập nhật phim");
            System.out.println("4. Hiển thị danh sách phim");
            System.out.println("5. Tìm kiếm phim theo tiêu đề");
            System.out.println("0. Thoát");

            try {
                System.out.print("Chọn chức năng: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } catch (Exception e) {
                System.out.println("Lựa chọn phải là một số nguyên. Vui lòng thử lại.");
                scanner.nextLine(); // clear invalid input
                continue; // prompt again
            }

            switch (choice) {
                case 1:
                    manager.addMovie(scanner);
                    break;
                case 2:
                    try {
                        System.out.print("Nhập ID phim cần xóa: ");
                        int idToRemove = scanner.nextInt();
                        manager.removeMovie(idToRemove);
                        break;
                    } catch (Exception e) {
                        System.out.println("ID phải là một số nguyên. Vui lòng thử lại.");
                        scanner.nextLine(); // clear invalid input
                    }
                case 3:
                    try {
                        System.out.print("Nhập ID phim cần cập nhật: ");
                        int idToUpdate = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        manager.updateMovie(scanner, idToUpdate);
                        break;
                    } catch (Exception e) {
                        System.out.println("ID phải là một số nguyên. Vui lòng thử lại.");
                        scanner.nextLine(); // clear invalid input
                    }
                case 4:
                    manager.displayMovies();
                    break;
                case 5:
                    try {
                        System.out.print("Nhập tiêu đề phim cần tìm: ");
                        String titleToSearch = scanner.nextLine();
                        Movie foundMovie = manager.searchMovieByTitle(titleToSearch);
                        if (foundMovie != null) {
                            System.out.println(foundMovie.toString());
                        } else {
                            System.out.println("Không tìm thấy phim với tiêu đề \"" + titleToSearch + "\".");
                        }
                        break;
                    } catch (Exception e) {
                        System.out.println("Lỗi khi tìm kiếm phim. Vui lòng thử lại.");
                        scanner.nextLine(); // clear invalid input
                    }
                case 0:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
