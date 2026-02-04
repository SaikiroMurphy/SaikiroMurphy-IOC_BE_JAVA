package Ex2;

import Manage.Manage;
import java.util.ArrayList;

public class AttendanceManager implements Manage<Student> {
    ArrayList<Student> studentList = new ArrayList<>();

    @Override
    public void add(Student item) {
        if (findIndexById(item.getId()) != -1) {
            System.out.println("ID đã tồn tại.");
            return;
        }
        studentList.add(item);
    }

    @Override
    public void update(int index, Student item) {
        if (findIndexById(item.getId()) != -1 && studentList.get(index).getId() != item.getId()) {
            System.out.println("ID đã tồn tại.");
            return;
        }
        studentList.set(index, item);
    }

    @Override
    public void delete(int index) {
        studentList.remove(index);
    }

    @Override
    public void display() {
        // Implementation here
        if (studentList.isEmpty()) {
            System.out.println("Không có học viên nào để hiển thị.");
            return;
        }
        System.out.println("Danh sách học viên:");
        for (Student student : studentList) {
            System.out.println("    " + student);
        }
    }

    public int findIndexById(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return studentList.indexOf(student);
            }
        }
        return -1;
    }
}
