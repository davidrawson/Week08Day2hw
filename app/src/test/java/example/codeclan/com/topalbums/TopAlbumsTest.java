package example.codeclan.com.topalbums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidrawson on 23/01/2018.
 */

public class TopAlbumsTest {

    @Test
    public void getListTest() {
        TopAlbums topMovies = new TopAlbums();
        assertEquals(13, topMovies.getList().size());
    }

}
