package book;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlEnum
public enum BookFormat {
    @XmlEnumValue("Hardback")
    HARD,
    @XmlEnumValue("Paperback")
    PAPERBACK,
    @XmlEnumValue("CD-Audio")
    CD_AUDIO;
}
