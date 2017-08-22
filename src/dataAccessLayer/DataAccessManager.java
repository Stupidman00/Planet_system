package dataAccessLayer;

import core.PlanetSystem;

public interface DataAccessManager {
    void save(PlanetSystem planetSystem, String filename);
    PlanetSystem open(String filename);
}
