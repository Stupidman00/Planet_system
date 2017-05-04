package core;

class PolarPoint {
    final private double angle;
    final private double radius;

    PolarPoint(double angle, double radius) {
        this.angle = angle;
        this.radius = radius;
    }

    double getAngle() {return angle;}
    double getRadius() {return radius;}
}
