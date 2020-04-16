package movie;

import java.math.BigDecimal;
import java.net.URL;
import java.time.Year;
import java.util.List;

import lombok.Data;

@Data
public class Movie {

    private String title;
    private Year year;
    private BigDecimal rating;
    private int votes;
    private List<String> genres;
    private URL url;

}