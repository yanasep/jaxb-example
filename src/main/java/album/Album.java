package album;

import java.util.List;

import lombok.Data;

@Data
public class Album {

    private String artist;
    private String title;
    private int year;
    private List<Track> tracks;

}