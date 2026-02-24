package Ex2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SubjectManager<T> {
    private static ArrayList<Subject> subjects;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public SubjectManager() {
        subjects = new ArrayList<>();
    }

    public void addSubject(Scanner scanner) {
        Subject subject = new Subject();

        while (true) {
            try {
                System.out.print("Nhập mã môn học: ");
                String code = scanner.nextLine();
                if (searchSubjectByCode(code) != null) {
                    System.out.println("Môn học với mã " + code + " đã tồn tại. Không thể thêm môn học trùng mã.");
                    continue;
                }
                subject.setCode(code);
                break;
            } catch (Exception e) {
                System.out.println("Lỗi nhập mã môn học. Vui lòng thử lại.");
            }
        }

        while (true) {
            try {
                System.out.print("Nhập tên môn học: ");
                String name = scanner.nextLine();
                subject.setName(name);
                break;
            } catch (Exception e) {
                System.out.println("Lỗi nhập tên môn học. Vui lòng thử lại.");
            }
        }

        while (true) {
            try {
                System.out.print("Nhập số tín chỉ: ");
                int credits = Integer.parseInt(scanner.nextLine());
                subject.setCredits(credits);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi nhập số tín chỉ. Vui lòng nhập một số nguyên.");
            }
        }

        while (true) {
            try {
                System.out.print("Nhập ngày bắt đầu (dd-MM-yyyy): ");
                String startDateStr = scanner.nextLine();
                subject.setStartDate(LocalDate.parse(startDateStr, formatter));
                break;
            } catch (Exception e) {
                System.out.println("Lỗi nhập ngày bắt đầu. Vui lòng nhập theo định dạng dd-MM-yyyy.");
            }
        }
        
        subjects.add(subject);
    }

    public void removeSubject(Scanner scanner) {
        System.out.print("Nhập mã môn học cần xóa: ");
        String code = scanner.nextLine();
        Subject subject = searchSubjectByCode(code);
        if (subject == null) {
            System.out.println("Không tìm thấy môn học với mã " + code + ". Không thể xóa.");
            return;
        }
        subjects.remove(subject);
    }
    
    public void updateSubject(Scanner scanner) {
        System.out.print("Nhập mã môn học cần cập nhật: ");
        String code = scanner.nextLine();
        Subject oldSubject = searchSubjectByCode(code);
        if (oldSubject == null) {
            System.out.println("Không tìm thấy môn học với mã " + code + ". Không thể cập nhật.");
            return;
        }

        System.out.println("Thông tin cũ: " + oldSubject.toString());
        Subject newSubject = new Subject();

        newSubject.setCode(oldSubject.getCode());

        while (true) {
            try {
                System.out.print("Nhập tên môn học mới: ");
                String newName = scanner.nextLine();
                newSubject.setName(newName);
                break;
            } catch (Exception e) {
                System.out.println("Lỗi nhập tên môn học mới. Vui lòng thử lại.");
            }
        }

        while (true) {
            try {
                System.out.print("Nhập số tín chỉ mới: ");
                int credits = Integer.parseInt(scanner.nextLine());
                newSubject.setCredits(credits);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi nhập số tín chỉ mới. Vui lòng nhập một số nguyên.");
            }
        }

        while (true) {
            try {
                System.out.print("Nhập ngày bắt đầu mới (dd-MM-yyyy): ");
                String startDateStr = scanner.nextLine();
                newSubject.setStartDate(LocalDate.parse(startDateStr, formatter));
                break;
            } catch (Exception e) {
                System.out.println("Lỗi nhập ngày bắt đầu mới. Vui lòng nhập theo định dạng dd-MM-yyyy.");
            }
        }

        int index = subjects.indexOf(oldSubject);
        if (index != -1) {
            subjects.set(index, newSubject);
        }
    }

    public void displaySubjects() {
        System.out.println("+--- Danh sách môn học ---+");
        for (Subject subject : subjects) {
            System.out.println(subject.toString());
        }
    }

    public Subject searchSubjectByCode(String code) {
        for (Subject subject : subjects) {
            if (subject.getCode().equalsIgnoreCase(code)) {
                return subject;
            }
        }
        return null;
    }

    public Subject searchSubjectByName(String name) {
        for (Subject subject : subjects) {
            if (subject.getName().equalsIgnoreCase(name)) {
                return subject;
            }
        }
        return null;
    }

    public void sortSubjectsByCredits() {
        System.out.println("+--- Danh sách môn học có số tín chỉ lớn hơn 3 ---+");
        for (Subject subject : subjects) {
            if (subject.getCredits() > 3) {
                System.out.println(subject.toString());
            }
        }
    }
}
