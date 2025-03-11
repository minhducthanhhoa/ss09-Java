package bai4;

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void inputCircle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào bán kính: ");
        this.radius = sc.nextDouble();
    }

    public void displayCircle() {
        System.out.println("Bán kính: "  + radius);
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }

}
