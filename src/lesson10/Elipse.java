package lesson10;

public class Elipse  extends Circle implements Figura{
    private double radius2;

    public Elipse() {
    }

    public Elipse(double radius, double radius2) {
        super(radius);
        this.radius2 = radius2;
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Elipse elipse = (Elipse) o;

        return Double.compare(elipse.radius2, radius2) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Elipse{" +
                "radius2=" + radius2 +
                '}';
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * Math.sqrt(((getRadius() * getRadius()) * (getRadius2() * getRadius2())) / 2);
    }

    @Override
    public double ploshad() {
        return Math.PI * getRadius2() * getRadius();
    }
}
