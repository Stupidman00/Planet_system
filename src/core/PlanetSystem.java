package core;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PlanetSystem {
    private Set<Planet> planets;
    private int step;

    public PlanetSystem() {
        this.planets = new HashSet<>();
        this.step = 1;
    }

    public void add(Planet p) {
        planets.add(p);
    }

    public void move() {
        for (Planet p : planets) {
            p.move(step);
        }
    }

    public Set<Planet> getPlanets() {
        return Collections.unmodifiableSet(planets);
    }

    public void setStep(int step) {
        this.step = step;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlanetSystem that = (PlanetSystem) o;

        return step == that.step && (getPlanets() != null ?
                getPlanets().equals(that.getPlanets()) : that.getPlanets() == null);
    }

    @Override
    public int hashCode() {
        int result = getPlanets() != null ? getPlanets().hashCode() : 0;
        result = 31 * result + step;
        return result;
    }

    @Override
    public String toString() {
        return "PlanetSystem{" +
                "planets=" + planets +
                ", step=" + step +
                '}';
    }
}
