package bai6;

public class Point2DManagerment {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(3, 4);
        Point2D p2 = new Point2D(6, 8);

        p1.displayPoint();
        p2.displayPoint();

        System.out.println("Khoảng cách giữa 2 điểm: " + p1.distanceTo(p2));

        p1.setX(10);
        p1.setY(12);
        System.out.println("Updated p1:");
        p1.displayPoint();
    }
}
