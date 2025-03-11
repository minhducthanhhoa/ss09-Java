package bai9;

public class FractionManagerment {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(2, 5);

        System.out.println("Phân số 1: " + f1);
        System.out.println("Phân số 2: " + f2);

        System.out.println("Tổng: " + f1.add(f2));
        System.out.println("Hiệu: " + f1.subtract(f2));
        System.out.println("Tích: " + f1.multiply(f2));
        System.out.println("Thương: " + f1.divide(f2));
    }
}
