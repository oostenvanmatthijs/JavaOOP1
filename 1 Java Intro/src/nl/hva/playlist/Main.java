package nl.hva.playlist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Matthijs van Oosten");
        System.out.println("500863129");
        System.out.printf("\n");
        System.out.println("In dit programma wordt er een playlist aangemaakt.");

        //Naam van playlist
        System.out.print("Wat is de naam van je playlist?");
        System.out.println("\n");
        Scanner reader = new Scanner(System.in);
        String playListName = reader.nextLine();
        Playlist playList = new Playlist();
        playList.setName(playListName);

        // Aantal tracks vragen
        int tracks = 0;
        while (tracks < Playlist.minTracks || tracks > Playlist.maxTracks) {
            System.out.println("Hoeveel tracks wil je op deze playlist?");
            tracks = reader.nextInt();
            reader.nextLine();
        }
        System.out.println("Aantal tracks: " + tracks + ".");
        System.out.println("\n");

        // Foreach loop om tracks namen te geven
        for (int i = 0; i < tracks; i++) {
            System.out.println("Titel van de track " + (i + 1) + "; ");
            Track track = new Track();
            String trackNaam = reader.nextLine();
            track.setName(trackNaam);

            System.out.println("Lengte van " + track.getName() + " in secondes: ");
            int secondes = reader.nextInt();
            reader.nextLine();
            track.setSeconds(secondes);
            playList.add(track);
        }

        // Laat de allerlangste track zien
        System.out.println("De naam van de allerlangste track is: ");
        System.out.println(playList.langsteTrack().getName());
        System.out.println("lengte is: " + playList.langsteTrack().getSeconds());



    }
}
