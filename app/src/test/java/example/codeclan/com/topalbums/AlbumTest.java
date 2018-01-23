package example.codeclan.com.topalbums;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidrawson on 23/01/2018.
 */

public class AlbumTest {

    Album album;

    @Before
    public void before(){
        album = new Album(2, "Prince", "Lovesexy", 1988);
    }

    @Test
    public void canGetRanking(){
        assertEquals((Integer)2, album.getRanking());
    }

    @Test
    public void canGetArtist(){
        assertEquals("Prince", album.getArtist());
    }

    @Test
    public void canGetTitle(){
        assertEquals("Lovesexy", album.getTitle());
    }

    @Test
    public void canGetYear(){
        assertEquals((Integer)1988, album.getYear());
    }
}
