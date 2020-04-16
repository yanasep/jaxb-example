package legoset;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Weight {
    @XmlAttribute
    String unit;
    @XmlValue
    double value;

    public Weight(String unit, double value) {
        this.unit = unit;
        this.value = value;
    }
}
