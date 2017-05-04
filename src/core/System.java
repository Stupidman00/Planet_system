package core;

import java.util.Collections;
import java.util.Set;

public class System {
    private static System ourInstance = new System(Collections.emptySet());
    private Set<Planet> planets;

    public static System getInstance() {
        return ourInstance;
    }

    private System(Set<Planet> planets) {
        this.planets = planets;
    }

    public void addPlanet(Planet p) {
        planets.add(p);
    }

    public void removePlanet(Planet p) {
        planets.remove(p);
    }

    public void move(int time) {
        for (Planet p : planets) {
            p.move(time);
        }
    }

}
