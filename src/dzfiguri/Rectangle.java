package dzfiguri;

public class Rectangle extends Shape{
    public double a;
    public double b;

    public Rectangle (double a, double b){
        super();
        this.a = a;
        this.b = b;
    }
    public Rectangle() {
        super();
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
    public double squareOfRectangle() {
        double p = a * b;
        return p;
    }
}
