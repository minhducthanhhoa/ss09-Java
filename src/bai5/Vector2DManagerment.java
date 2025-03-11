package bai5;

public class Vector2DManagerment {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(1, 2);

        System.out.print("Vector 1: ");
        v1.displayVector();
        System.out.print("Vector 2: ");
        v2.displayVector();

        System.out.println("Độ dài của vector 1: " + v1.calculateMagnitude());
        System.out.println("Độ dài vector 2: " + v2.calculateMagnitude());

        Vector2D sum = v1.add(v2);
        System.out.print("Tổng của 2 độ dài: ");
        sum.displayVector();

        Vector2D difference = v1.subtract(v2);
        System.out.print("Hiệu của 2 vector: ");
        difference.displayVector();

        System.out.println("Tích của 2 vector: " + v1.dotProduct(v2));
    }
}
