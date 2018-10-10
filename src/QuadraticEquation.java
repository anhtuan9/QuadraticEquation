public class QuadraticEquation {
    private double a, b, c;
    private double denta = b * b - 4 * a * c;

    public QuadraticEquation() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDenta() {
        return denta;
    }

    public double getRoot1() {
        if (denta > 0) {
            return (-b + Math.sqrt(denta)) / 2 * a;
        }
        return 0;
    }
    public double getRoot2() {
        if (denta > 0) {
            return (-b + Math.sqrt(denta)) / 2 * a;
        }
        return 0;
    }
}
