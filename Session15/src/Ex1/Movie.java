package Ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Movie {
    private int id;
    private String title;
    private String director;
    private LocalDate releaseDate;
    private float rating;
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Movie(int id) {
        this.id = id;
    }

    public Movie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void inputData (Scanner scanner) {
        // read and validate integer id
        while (true) { 
            try {
                System.out.print("Nhập ID: ");
                this.setId(scanner.nextInt());
                scanner.nextLine(); // consume newline
                break; // valid integer obtained
            } catch (Exception e) {
                System.out.println("ID phải là một số nguyên. Vui lòng thử lại.");
                scanner.nextLine(); // clear invalid input
            }
        }

        System.out.print("Nhập tiêu đề: ");
        this.setTitle(scanner.nextLine());

        System.out.print("Nhập đạo diễn: ");
        this.setDirector(scanner.nextLine());


        while (true) {
            try {
                System.out.print("Nhập ngày ra mắt (DD-MM-YYYY): ");
                this.setReleaseDate(LocalDate.parse(scanner.nextLine(), formatter));
                scanner.nextLine(); // consume newline
                break;
            } catch (Exception e) {
                System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại.");
            }
        }

        while (true) { 
            try {
                System.out.print("Nhập đánh giá (0.0 - 10.0): ");
                this.setRating(scanner.nextFloat());
                if (this.getRating() < 0 || this.getRating() > 10) {
                    System.out.println("Đánh giá phải nằm trong khoảng từ 0.0 đến 10.0. Vui lòng nhập lại.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Đánh giá không hợp lệ. Vui lòng nhập lại.");
                scanner.nextLine(); // consume invalid input
            }
        }
    }

    public void inputData(Scanner scanner, int id) {
        this.setId(id);
        
        System.out.print("Nhập tiêu đề: ");
        this.setTitle(scanner.nextLine());

        System.out.print("Nhập đạo diễn: ");
        this.setDirector(scanner.nextLine());

        while (true) {
            try {
                System.out.print("Nhập ngày ra mắt (DD-MM-YYYY): ");
                this.setReleaseDate(LocalDate.parse(scanner.nextLine(), formatter));
                scanner.nextLine(); // consume newline
                break;
            } catch (Exception e) {
                System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại.");
            }
        }

        while (true) {
            try {
                System.out.print("Nhập đánh giá (0.0 - 10.0): ");
                this.setRating(scanner.nextFloat());
                if (this.getRating() < 0 || this.getRating() > 10) {
                    System.out.println("Đánh giá phải nằm trong khoảng từ 0.0 đến 10.0. Vui lòng nhập lại.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Đánh giá không hợp lệ. Vui lòng nhập lại.");
                scanner.nextLine(); // consume invalid input
            }
        }
    }

    @Override
    public String toString() {
        return "Phim {" +
                "id=" + id +
                ", Tiêu đề='" + title + '\'' +
                ", Đạo diễn='" + director + '\'' +
                ", Ngày ra mắt=" + releaseDate.format(formatter) +
                ", Đánh giá=" + rating +
                '}';
    }
}
