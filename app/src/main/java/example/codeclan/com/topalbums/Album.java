package example.codeclan.com.topalbums;

/**
 * Created by davidrawson on 23/01/2018.
 */

public class Album {

    private Integer ranking;
    private String artist;
    private String title;
    private Integer year;


    public Album (Integer ranking, String artist, String title, Integer year){

        this.ranking = ranking;
        this.artist = artist;
        this.title = title;
        this.year = year;
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

    @Override
    public String toString() {
        return this.getTitle() + this.getYear();
    }
}
