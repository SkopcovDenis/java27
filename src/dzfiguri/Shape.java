package dzfiguri;

public class Shape {
    private double a;
    private double b;
    private double c;
    private double r;
    private double rM;
    private double rB;

    public Shape() {
    }


    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Shape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public Shape(double r) {
        this.r = r;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getrM() {
        return rM;
    }

    public void setrM(double rM) {
        this.rM = rM;
    }

    public double getrB() {
        return rB;
    }

    public void setrB(double rB) {
        this.rB = rB;
    }
}
