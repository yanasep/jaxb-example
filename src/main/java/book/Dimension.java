package book;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"width", "height", "thickness", "unit"})
@Data
@AllArgsConstructor
public class Dimension {

    @XmlAttribute
    private int width;
    @XmlAttribute
    private int height;
    @XmlAttribute
    private int thickness;
    @XmlAttribute
    private String unit;
}
