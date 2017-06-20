package core;

public class PolarPoint {
    final private double angle;
    final private double radius;

    PolarPoint(double angle, double radius) {
        this.angle = angle;
        this.radius = radius;
    }

    public double getAngle() {return angle;}
    public double getRadius() {return radius;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PolarPoint that = (PolarPoint) o;

        return Double.compare(that.getAngle(), getAngle()) == 0 &&
                Double.compare(that.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getAngle());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getRadius());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
