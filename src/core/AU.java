package core;

import lombok.Data;

import javax.xml.bind.annotation.adapters.XmlAdapter;

@Data(staticConstructor = "value")
public class AU {
    private final double value;

    static public class AUAdapter extends XmlAdapter<Double, AU> {
        @Override
        public AU unmarshal(Double v) throws Exception {
            return AU.value(v);
        }

        @Override
        public Double marshal(AU v) throws Exception {
            return v.getValue();
        }
    }
}