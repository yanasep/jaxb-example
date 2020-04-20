package book;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"name", "about"})
@Data
@AllArgsConstructor
public class Author {
    String name;
    String about;
}
