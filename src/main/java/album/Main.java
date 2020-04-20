package album;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import jaxb.JAXBHelper;

public class Main {

    public static void main(String[] args) throws Exception {
        Album album = new Album();
        album.setArtist("Porcupine Tree");
        album.setTitle("Fear of a Blank Planet");
        album.setYear(2007);

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Fear of a Blank Planet", 448));
        tracks.add(new Track("My Ashes", 307));
        tracks.add(new Track("Anesthetize", 1062));
        tracks.add(new Track("Sentimental", 326));
        tracks.add(new Track("Way Out of Here", 457));
        tracks.add(new Track("Sleep Together", 448));
        album.setTracks(tracks);

//        System.out.println(album);
        JAXBHelper.toXML(album, System.out);
    }

}
