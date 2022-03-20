package nl.hva.playlist;

public class Track {
    private String artiest;
    private String naam;
    private int secondes;


    public Track() {
        this.naam = naam;
        this.secondes = secondes;
        this.artiest = artiest;
    }

    public String getName() {
        return naam;
    }

    public void setName(String naam) {
        this.naam = naam;
    }

    public int getSeconds() {
        return this.secondes;
    }

    public void setSeconds(int seconds) {
        this.secondes = seconds;
    }


    public String getArtist() {
        return artiest;
    }

    public void setArtist(String artist) {
        this.artiest = artiest;
    }

}
