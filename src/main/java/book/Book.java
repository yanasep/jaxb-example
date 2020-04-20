package book;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Map;

@XmlRootElement
@Data
public class Book {
    int pages;
    int rank;
    double weight;
    String title;
    String isbn10;
    String isbn13;
    String imprint;
    String publisher;
    String publicationCity;
    String publicationCountry;
    String language;
    String description;
    Author author;
    BookFormat format;
    Dimension dimension;
    Calendar publicationDate;
    Map<Currency, BigDecimal> price;
    Rate rating;
}
