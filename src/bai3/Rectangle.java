package bai3;
import java.util.Scanner;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter(){
        return 2 *  (length + width);
    }

    public void inputRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào chiều dài: ");
        this.length = scanner.nextDouble();

        System.out.print("Nhập vào chều rộng: ");
        this.width = scanner.nextDouble();
    }

    public void displayData(){
        System.out.printf("Thông tin hình chữ nhật: ");
        System.out.println("Chiều dài: " + length);
        System.out.println("Chiều rộng: "  + width);
        System.out.printf("Diện tích: " + getArea());
        System.out.printf("CHu vi: " + getPerimeter());
    }
}
