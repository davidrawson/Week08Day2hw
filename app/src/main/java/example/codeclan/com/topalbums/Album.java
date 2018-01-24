package example.codeclan.com.topalbums;

import java.io.Serializable;

/**
 * Created by davidrawson on 23/01/2018.
 */

public class Album implements Serializable{

    private Integer ranking;
    private String artist;
    private String title;
    private Integer year;
    private int coverArt;


    public Album (Integer ranking, String artist, String title, Integer year, int coverArt){

        this.ranking = ranking;
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.coverArt = coverArt;
    }


    public Integer getRanking() {
        return this.ranking;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getYear() {
        return this.year;
    }

    public int getCoverArt(){
        return this.coverArt;
    }

    @Override
    public String toString() {
        return this.getTitle() + this.getYear();
    }
}
