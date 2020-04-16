package legoset;

import lombok.Data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Minifig {
    @XmlAttribute
    int count;
    @XmlValue
    String name;

    public Minifig(int count, String name) {
        this.count = count;
        this.name = name;
    }
}
