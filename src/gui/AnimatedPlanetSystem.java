package gui;

//import core.PlanetSystem;
//import javafx.scene.Group;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import org.jetbrains.annotations.NotNull;

public class AnimatedPlanetSystem {
//    private PlanetSystem planetSystem;
//    private Group planetSystemGroup;
//    private int timeInterval;
//
//    private AnimatedPlanetSystem(PlanetSystem planetSystem, Group planetSystemGroup) {
//        this.planetSystem = planetSystem;
//        this.planetSystemGroup = planetSystemGroup;
//        timeInterval = 1;
//    }
//
//    public void setTimeInterval(int timeInterval) {
//        this.timeInterval = timeInterval;
//    }
//
//    public void move() {
//        planetSystem.move(timeInterval);
//    }
//
//    @NotNull
//    public static AnimatedPlanetSystem createAnimatedPlanetSystem() {
//        PlanetSystem ps = PlanetSystem.createPlanetSystem();
//
//        Group psg = new Group();
//        for (Planet p: ps.getPlanets()) {
//            Circle pc = new Circle(5);
//            convertCoordinate(p, pc);
//            psg.getChildren().add(pc);
//        }
//        Circle star = new Circle(15, Color.BLACK);
//        psg.getChildren().add(star);
//
//        return new AnimatedPlanetSystem(ps, psg);
//    }
//
//    private static void convertCoordinate(Planet planet, Circle planetCircle) {
//        planetCircle.setCenterY(-Math.sin(planet.getCurrentPos().getAngle()) *
//                planet.getCurrentPos().getRadius());
//        planetCircle.setCenterX(Math.cos(planet.getCurrentPos().getAngle()) *
//                planet.getCurrentPos().getRadius());
//    }
}
