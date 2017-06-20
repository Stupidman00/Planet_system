package core;

/**
 * todo
 * Пока сложно представить кеплеровское невозмущенное движение,
 * поэтому взята тривиальная модель, которая будет постепенно усложняться.
 */
public class Planet {
    private double radius;
    private int period;
    private PolarPoint currentPos;

    public static Planet createPlanet(double radius,
                                      int period,
                                      double startPosition) {
        return new Planet(radius, period, startPosition);
    }

    private Planet(double radius, int period, double startPosition) {
        this.radius = radius;
        this.period = period;
        this.currentPos = new PolarPoint(startPosition, radius);
    }

    private double getRadius() { return radius; }
    private int getPeriod() { return period; }
    public PolarPoint getCurrentPos() { return currentPos; }

    void move(int time) {
        double a = (2*Math.PI/period)*time + currentPos.getAngle();
        double r = radius;
        currentPos = new PolarPoint(a, r);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Planet planet = (Planet) o;

        return Double.compare(planet.getRadius(), getRadius()) == 0 &&
                getPeriod() == planet.getPeriod() && (getCurrentPos() != null ?
                getCurrentPos().equals(planet.getCurrentPos()) : planet.getCurrentPos() == null);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getRadius());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getPeriod();
        result = 31 * result + (getCurrentPos() != null ? getCurrentPos().hashCode() : 0);
        return result;
    }
}
