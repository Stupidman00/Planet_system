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

    public void move(int time) {
        double a = (2*Math.PI/period)*time + currentPos.getAngle();
        double r = radius;
        currentPos = new PolarPoint(a, r);
    }

}
