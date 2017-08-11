package core;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PlanetSystem {
    private final String sunName;
    private final String sunDescription;
    private final List<Planet> planets;

    @Data
    @XmlRootElement(name = "planetSystem")
    @XmlType(propOrder = {"sunName", "sunDescription", "planets"}, namespace = "PlanetSystem")
    static public class Builder {
        private String sunName;
        private String sunDescription;
        private List<Planet.Builder> planets;

        @XmlElement(name = "sunName")
        public Builder setSunName(String sunName) {
            this.sunName = sunName;
            return this;
        }

        @XmlElement(name = "sunDescription")
        public Builder setSunDescription(String sunDescription) {
            this.sunDescription = sunDescription;
            return this;
        }

        @XmlElement(name = "planet")
        public Builder setPlanets(List<Planet.Builder> planets) {
            this.planets = planets;
            return this;
        }

        public PlanetSystem build() {
            List<Planet> realPlanets = new ArrayList<>();
            for (Planet.Builder p : this.planets) {
                realPlanets.add(p.build());
            }
            return new PlanetSystem(sunName, sunDescription, realPlanets);
        }
    }

//    public static PlanetSystem createPlanetSystem(File file) {
//
//    }
//
    public void move(int timeInterval) {
        for (Planet p: planets) {
            p.move(timeInterval);
        }
    }

}