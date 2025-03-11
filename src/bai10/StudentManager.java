package bai10;
import java.util.Scanner;

public class StudentManager {
    private Student[] students = new Student[100];
    private int count = 0;

    public void addStudent(Scanner scanner) {
        if (count >= students.length) {
            System.out.println("Danh sách đã đầy, không thể thêm mới!");
            return;
        }
        students[count] = new Student();
        students[count].inputData(scanner, count + 1);
        count++;
        System.out.println("Đã thêm sinh viên thành công!");
    }

    public void displayAllStudents() {
        if (count == 0) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (int i = 0; i < count; i++) {
                students[i].displayData();
            }
        }
    }

    public void editStudent(Scanner scanner) {
        System.out.print("Nhập mã sinh viên cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                System.out.println("Nhập thông tin mới:");
                students[i].inputData(scanner, id);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã " + id);
    }

    public void deleteStudent(Scanner scanner) {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                System.out.println("Đã xóa sinh viên thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã " + id);
    }
}
