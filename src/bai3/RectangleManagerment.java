package bai3;

public class RectangleManagerment {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle 1: " + rect1);
        rect1.displayData();

        Rectangle rect2 = new Rectangle();
        System.out.println("\nRectangle 2: " + rect2);
        rect2.inputRectangle();
        rect2.displayData();
    }
}
