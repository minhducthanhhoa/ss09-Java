package bai10;
import java.util.Scanner;
enum Gender {
    MALE, FEMALE, OTHER;
}
public class Student {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;

    public Student() {}

    public Student(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void inputData(Scanner scanner, int id) {
        this.id = id;
        System.out.print("Nhập tên sinh viên: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giới tính (MALE, FEMALE, OTHER): ");
        this.gender = Gender.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        this.phoneNumber = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Mã HS: " + id + " | Tên: " + name + " | Tuổi: " + age + " | Giới tính: " + gender +
                " | Địa chỉ: " + address + " | SĐT: " + phoneNumber);
    }
}

