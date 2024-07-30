package com.example.pattern;

import java.util.ArrayList;

/**
 * Music-Player with Playlist
 */

class Track {
    private String title;
    private int duration;

    Track(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}

// Open-Closed Principle
class PlayList {
    private ArrayList<Track> tracks = new ArrayList<>();

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public Track getNextTrack() {
        return tracks.remove(0);
    }
}


public class Ex {

    public static void main(String[] args) {

        PlayList playList = new PlayList();
        playList.addTrack(new Track("Track 1", 120));
        playList.addTrack(new Track("Track 2", 150));
        playList.addTrack(new Track("Track 3", 180));
        playList.addTrack(new Track("Track 4", 210));
        playList.addTrack(new Track("Track 5", 240));

        // Play the tracks
        int i = 0;
        while (i < 5) {
            Track track = playList.getNextTrack();
            System.out.println("Playing: " + track.getTitle());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }

    }

}
