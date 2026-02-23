package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieManager {
    // use the Movie class in this package rather than a type parameter
    private ArrayList<Movie> movies;

    public MovieManager() {
        movies = new ArrayList<>();
    }

    public void addMovie(Scanner scanner) {
        Movie movie = new Movie();
        movie.inputData(scanner);
        if (searchMovieById(movie.getId()) != null) {
            System.out.println("Phim với ID " + movie.getId() + " đã tồn tại. Không thể thêm phim trùng ID.");
            return;
        }
        movies.add(movie);
    }

    public void removeMovie(int id) {
        Movie movie = searchMovieById(id);
        if (movie == null) {
            System.out.println("Không tìm thấy phim với ID " + id + ". Không thể xóa.");
            return;
        }
        movies.remove(movie);
    }

    public void updateMovie(Scanner scanner, int id) {
        Movie oldMovie = searchMovieById(id);
        if (oldMovie == null) {
            System.out.println("Không tìm thấy phim với ID " + id + ". Không thể cập nhật.");
            return;
        }

        System.out.println("Thông tin cũ: " + oldMovie.toString());
        Movie newMovie = new Movie();
        newMovie.inputData(scanner, oldMovie.getId());
        int index = movies.indexOf(oldMovie);
        if (index != -1) {
            movies.set(index, newMovie);
        }
    }

    public void displayMovies() {
        System.out.println("+--- Danh sách phim ---+");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }

    public Movie searchMovieByTitle(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null; // Return null if not found
    }

    public Movie searchMovieById (int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null; // Return null if not found
    }

    public void sortMoviesByRating() {
        movies.sort((m1, m2) -> Float.compare(m2.getRating(), m1.getRating()));
    }
}
