package dzfiguri;

public class Ellipse extends  Shape{
    public double rM;
    public double rB;


    public Ellipse(double rM, double rB) {
        super();
        this.rM = rM;
        this.rB = rB;

    }
    public Ellipse(){
        super();
    }


    public double getSquare() {
        return Math.PI * rM * rB;
    }
}
