package core;

import dataAccessLayer.DataAccessManager;
import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@XmlRootElement
@XmlType(propOrder = {"sunName", "sunDescription", "planets"})
public class PlanetSystem {
    private String sunName;
    private String sunDescription;
    private List<Planet> planets;

    static public PlanetSystem create(DataAccessManager dataAccessManager,
                                      String filename) {
        return dataAccessManager.open(filename);
    }

    public void savePlanetSystem(DataAccessManager dataAccessManager, String filename) {
        dataAccessManager.save(this, filename);
    }

    public void move(int timeInterval) {
        for (Planet p: planets) {

        }
    }

}