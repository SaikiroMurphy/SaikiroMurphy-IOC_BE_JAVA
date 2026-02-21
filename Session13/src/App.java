
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Nguyễn Văn Hiển");
        students.add("Đoàn Minh Tuấn");
        students.add("Phạm Thị Thu Hà");

        System.out.println("List ban đầu: ");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("Học sinh có index là 2: ");
        System.out.println(students.get(2));

        students.set(1, "Hồ Đức Minh");

        System.out.println("List sau khi set: ");
        for (String student : students) {
            System.out.println(student);
        }

        students.remove(0);

        System.out.println("List sau khi remove: ");
        for (String student : students) {
            System.out.println(student);
        }

        students.add(0, "Vũ Văn Vượng");

        System.out.println("List sau khi add: ");
        for (String student : students) {
            System.out.println(student);
        }

        students.sort(c);

        System.out.println("Danh sách học sinh có tên chứa 'Văn': ");
        for (String student : students) {
            if (student.toLowerCase().contains("văn")) {
                System.out.println(student);
            }
        }
    }
}
