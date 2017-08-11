package core;

import lombok.Data;

import javax.xml.bind.annotation.adapters.XmlAdapter;

@Data(staticConstructor = "value")
public class Radian {
    private final double value;

    static public class RadianAdapter extends XmlAdapter<Double, Radian> {
        @Override
        public Radian unmarshal(Double v) throws Exception {
            return Radian.value(v);
        }

        @Override
        public Double marshal(Radian v) throws Exception {
            return v.getValue();
        }
    }
}