package ra;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
    // Constructor: các hàm giúp khởi tạo đối tượng từ lớp

    public Student() {
    }
    // constructor 2 tham số khởi tạo đối tượng
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, int age, boolean sex, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    // methods mô tả các hành vi của đối tượng

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // methods behavior: phương thức hành vi
    public int addTwoNumbers(int a, int b){
        return a+b;
    }

    public void helloTeacher(){
        System.out.println("Xin chào giảng viên");
    }

    public void inputData(Scanner scanner){
        System.out.println("Nhập vào mã sinh viên: ");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên: ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        this.age = scanner.nextInt();
        System.out.println("Nhập vào giới tính sinh viên: ");
        this.sex =  scanner.nextBoolean();
        System.out.println("Nhập vào địa chỉ sinh viên: ");
        this.address = scanner.nextLine();
    }

    public  void displayData(){

    }
}
