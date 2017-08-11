package core;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@Data
public class Planet {
    private final String name;
    private final String description;
    private final AU semimajorAxis;
    private final double eccentricity;
    private final Radian inclination;
    private final Radian periapsisArg;
    private final Radian ascendingNode;
    private final Radian epochTrueAnomaly;

    @Data
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    @ToString
    @XmlRootElement(name = "planet")
    @XmlType(propOrder = {"name", "description", "semimajorAxis", "eccentricity",
            "inclination", "periapsisArg", "ascendingNode", "epochTrueAnomaly"},
    namespace = "Planet")
    static public class Builder {
        private String name;
        private String description;
        private AU semimajorAxis;
        private double eccentricity;
        private Radian inclination;
        private Radian periapsisArg;
        private Radian ascendingNode;
        private Radian epochTrueAnomaly;

        @XmlElement(name = "name")
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        @XmlElement(name = "description")
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        @XmlElement(name = "semimajorAxis")
        @XmlJavaTypeAdapter(AU.AUAdapter.class)
        public Builder setSemimajorAxis(AU semimajorAxis) {
            this.semimajorAxis = semimajorAxis;
            return this;
        }

        @XmlElement(name = "eccentricity")
        public Builder setEccentricity(double eccentricity) {
            this.eccentricity = eccentricity;
            return this;
        }

        @XmlElement(name = "inclination")
        @XmlJavaTypeAdapter(Radian.RadianAdapter.class)
        public Builder setInclination(Radian inclination) {
            this.inclination = inclination;
            return this;
        }

        @XmlElement(name = "periapsisArg")
        @XmlJavaTypeAdapter(Radian.RadianAdapter.class)
        public Builder setPeriapsisArg(Radian periapsisArg) {
            this.periapsisArg = periapsisArg;
            return this;
        }

        @XmlElement(name = "ascendingNode")
        @XmlJavaTypeAdapter(Radian.RadianAdapter.class)
        public Builder setAscendingNode(Radian ascendingNode) {
            this.ascendingNode = ascendingNode;
            return this;
        }

        @XmlElement(name = "epochTrueAnomaly")
        @XmlJavaTypeAdapter(Radian.RadianAdapter.class)
        public Builder setEpochTrueAnomaly(Radian epochTrueAnomaly) {
            this.epochTrueAnomaly = epochTrueAnomaly;
            return this;
        }

        Planet build() {
            return new Planet(name,
                    description,
                    semimajorAxis,
                    eccentricity,
                    inclination,
                    periapsisArg,
                    ascendingNode,
                    epochTrueAnomaly);
        }
    }

    static public Builder builder() {
        return new Builder();
    }

    void move(int timeInterval) {

    }
}
