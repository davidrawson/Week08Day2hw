package example.codeclan.com.topalbums;

import java.util.ArrayList;

/**
 * Created by davidrawson on 23/01/2018.
 */

public class TopAlbums {

    private ArrayList<Album> albumList;

    public TopAlbums(){
        albumList = new ArrayList<Album>();
        albumList.add(new Album(1, "The Boo Radleys", "Giant Steps", 1993, "giant_steps"));
        albumList.add(new Album(2, "The Beatles", "Revolver", 1966, "revolver"));
        albumList.add(new Album(3, "R.E.M.", "Life's Rich Pageant", 1986,"lifes_rich_pagent"));
        albumList.add(new Album(4, "Liz Phair", "Exile In Guyville", 1993, "exile_in_guyville"));
        albumList.add(new Album(5, "The Beatles", "Abbey Road", 1969, "abbey_road"));
        albumList.add(new Album(6, "The Orb", "The Orb's Adventures Beyond The Ultraworld", 1991, "ultraworld"));
        albumList.add(new Album(7, "Throwing Muses", "Limbo", 1996, "limbo"));
        albumList.add(new Album(8, "Beyoncé", "Lemonade", 2016, "lemonade"));
        albumList.add(new Album(9, "The Pixies", "Surfer Rosa", 1988, "surfer_rosa"));
        albumList.add(new Album(10, "Sonic Youth", "Daydream Nation", 1988, "daydream_nation"));
        albumList.add(new Album(11, "Radiohead", "OK Computer", 1997, "ok_computer"));
        albumList.add(new Album(12, "Belle and Sebastian", "The Boy With The Arab Strap", 1998, "arab_strap"));
        albumList.add(new Album(13, "Nick Drake", "Five Leaves Left", 1969, "five_leaves_left"));
    }


    public ArrayList<Album> getList() {
        return new ArrayList<Album>(albumList);
    }
}
