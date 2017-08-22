package dataAccessLayer;

import core.PlanetSystem;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBManager implements DataAccessManager {
    @Override
    public void save(PlanetSystem planetSystem, String filename) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(PlanetSystem.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(planetSystem, new File(filename));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Override
    public PlanetSystem open(String filename) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(PlanetSystem.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (PlanetSystem) unmarshaller.unmarshal(new File(filename));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
