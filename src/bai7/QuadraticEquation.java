package bai7;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public boolean hasRealRoots() {
        return getDiscriminant() >= 0;
    }

    public double getRoot1() {
        if (hasRealRoots()) {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return Double.NaN; // Không có nghiệm thực
        }
    }

    public double getRoot2() {
        if (hasRealRoots()) {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return Double.NaN;
        }
    }

    public void display() {
        if (getDiscriminant() > 0) {
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("x1 = " + getRoot1());
            System.out.println("x2 = " + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println("Phương trình có một nghiệm kép: x = " + getRoot1());
        } else {
            System.out.println("Phương trình không có nghiệm thực.");
        }
    }
}
