package nl.hva.playlist;


import java.util.ArrayList;

public class Playlist {


    public static final int minTracks = 2;
    public static final int maxTracks = 20;
    private ArrayList<Track> trackList;

    private String naam;

    public String getName() {
        return naam;
    }

    public void setName(String naam) {
        this.naam = naam;
    }

    public Playlist() {
        trackList = new ArrayList<>();
        naam = "Nieuwe Playlist";
    }

    public void add(Track track) {
        trackList.add(track);
    }

    public Track langsteTrack() {
        Track deAllerLangsteTrack = trackList.get(0);
        for (Track currentTrack : trackList) {
            if (currentTrack.getSeconds() > deAllerLangsteTrack.getSeconds()) {
                deAllerLangsteTrack = currentTrack;
            }
        }
        return deAllerLangsteTrack;
    }




}
