package dzfiguri;

public class Square extends Shape{
    public double a;
    public double b;


    public Square (double a, double b){
        super();
        this.a = a;
        this.b = b;
    }
    public Square() {
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
    public double squareOfSquare() {
        double p = a * b;
        return p;
    }
}
