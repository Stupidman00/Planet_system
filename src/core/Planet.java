package core;

import lombok.*;

import javax.xml.bind.annotation.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@XmlRootElement
@XmlType (propOrder = {"name", "description", "semimajorAxis", "eccentricity",
        "inclination", "periapsisArg", "ascendingNode", "epochTrueAnomaly"})
@XmlAccessorType(XmlAccessType.FIELD)
class Planet {
    private String name;
    private String description;
    private AU semimajorAxis;
    private double eccentricity;
    private Radian inclination;
    private Radian periapsisArg;
    private Radian ascendingNode;
    private Radian epochTrueAnomaly;

    void move(int timeInterval) {

    }
}
