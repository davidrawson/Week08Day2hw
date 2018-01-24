package example.codeclan.com.topalbums;

import java.util.ArrayList;

/**
 * Created by davidrawson on 23/01/2018.
 */

public class TopAlbums {

    private ArrayList<Album> albumList;

    public TopAlbums(){
        albumList = new ArrayList<Album>();
        albumList.add(new Album(1, "The Boo Radleys", "Giant Steps", 1993, R.drawable.giant_steps));
        albumList.add(new Album(2, "The Beatles", "Revolver", 1966, R.drawable.revolver));
        albumList.add(new Album(3, "R.E.M.", "Life's Rich Pageant", 1986,R.drawable.lifes_rich_pageant));
        albumList.add(new Album(4, "Liz Phair", "Exile In Guyville", 1993, R.drawable.exile_in_guyville));
        albumList.add(new Album(5, "The Beatles", "Abbey Road", 1969, R.drawable.abbey_road));
        albumList.add(new Album(6, "The Orb", "The Orb's Adventures Beyond The Ultraworld", 1991, R.drawable.ultraworld));
        albumList.add(new Album(7, "Throwing Muses", "Limbo", 1996, R.drawable.limbo));
        albumList.add(new Album(8, "Beyoncé", "Lemonade", 2016, R.drawable.lemonade));
        albumList.add(new Album(9, "The Pixies", "Surfer Rosa", 1988, R.drawable.surfer_rosa));
        albumList.add(new Album(10, "Sonic Youth", "Daydream Nation", 1988, R.drawable.daydream_nation));
        albumList.add(new Album(11, "Radiohead", "OK Computer", 1997, R.drawable.ok_computer));
        albumList.add(new Album(12, "Belle and Sebastian", "The Boy With The Arab Strap", 1998, R.drawable.arab_strap));
        albumList.add(new Album(13, "Nick Drake", "Five Leaves Left", 1969, R.drawable.five_leaves_left));
   }


    public ArrayList<Album> getList() {
        return new ArrayList<Album>(albumList);
    }
}
