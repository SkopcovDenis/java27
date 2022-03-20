package dzfiguri;

public class Circle extends Shape{
    public double r;

    public Circle(double r){
        super();
        this.r = r;
    }

    public Circle() {
        super();
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double squareOfCircle() {
        double p = Math.PI * (r * r);
        return p;
    }

}
