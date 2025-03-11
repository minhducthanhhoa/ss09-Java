package bai4;

public class CircleManagerment {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1: " + circle1);
        circle1.displayCircle();

        Circle circle2 = new Circle();
        System.out.println("Circle 2: " + circle2);
        circle2.inputCircle();
        circle2.displayCircle();
    }
}
