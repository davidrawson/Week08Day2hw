package example.codeclan.com.topalbums;

import java.util.ArrayList;

/**
 * Created by davidrawson on 23/01/2018.
 */

public class TopAlbums {

    private ArrayList<Album> albumList;

    public TopAlbums(){
        albumList = new ArrayList<Album>();
        albumList.add(new Album(1, "The Boo Radleys", "Giant Steps", 1993));
        albumList.add(new Album(2, "The Beatles", "Revolver", 1966));
        albumList.add(new Album(3, "R.E.M.", "Life's Rich Pageant", 1986));
        albumList.add(new Album(4, "Liz Phair", "Exile In Guyville", 1993));
        albumList.add(new Album(5, "The Beatles", "Abbey Road", 1969));
        albumList.add(new Album(6, "The Orb", "The Orb's Adventures Beyond The Ultraworld", 1991));
        albumList.add(new Album(7, "Throwing Muses", "Limbo", 1996));
        albumList.add(new Album(8, "Beyoncé", "Lemonade", 2016));
        albumList.add(new Album(9, "The Pixies", "Surfer Rosa", 1988));
        albumList.add(new Album(10, "Sonic Youth", "Daydream Nation", 1988));
        albumList.add(new Album(11, "Radiohead", "OK Computer", 1997));
        albumList.add(new Album(12, "Belle and Sebastian", "The Boy With The Arab Strap", 1998));
        albumList.add(new Album(13, "Nick Drake", "Five Leaves Left", 1969));
    }


    public ArrayList<Album> getList() {
        return new ArrayList<Album>(albumList);
    }
}
