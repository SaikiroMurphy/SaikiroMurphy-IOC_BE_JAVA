
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class App {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Random random = new Random();
        List<Integer> list = Stream.generate(() -> random.nextInt(100)).limit(100).toList();
        list.stream().filter(App::isPrime).forEach(System.out::print);
        list.stream().filter(x -> x % 3 == 0).reduce(0, Integer::sum);

    }
}
