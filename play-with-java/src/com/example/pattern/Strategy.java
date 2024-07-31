package com.example.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Strategy Pattern
 * <p>
 * e.g PlayList , getNextTrack() method can have different strategies
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


// Strategy
interface PlayListStrategy {
    Track getNextTrack(List<Track> tracks);
}

// Concrete Strategy
class RandomPlayListStrategy implements PlayListStrategy {
    @Override
    public Track getNextTrack(List<Track> tracks) {
        int index = (int) (Math.random() * tracks.size());
        return tracks.remove(index);
    }
}

// Concrete Strategy
class RepeatPlayListStrategy implements PlayListStrategy {
    @Override
    public Track getNextTrack(List<Track> tracks) {
        return tracks.get(0);
    }
}

// Concrete Strategy
class ShortestDurationPlayListStrategy implements PlayListStrategy {
    @Override
    public Track getNextTrack(List<Track> tracks) {
        Track shortestTrack = tracks.get(0);
        for (Track track : tracks) {
            if (track.getDuration() < shortestTrack.getDuration()) {
                shortestTrack = track;
            }
        }
        tracks.remove(shortestTrack);
        return shortestTrack;
    }
}


// Context
class PlayList {

    private ArrayList<Track> tracks = new ArrayList<>();
    private PlayListStrategy playListStrategy;

    public void setPlayListStrategy(PlayListStrategy playListStrategy) {
        this.playListStrategy = playListStrategy;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public Track getNextTrack() {
        return playListStrategy.getNextTrack(tracks);
    }
}


public class Strategy {

    public static void main(String[] args) {

        PlayList playList = new PlayList();
        playList.addTrack(new Track("Track 1", 120));
        playList.addTrack(new Track("Track 2", 150));
        playList.addTrack(new Track("Track 3", 180));
        playList.addTrack(new Track("Track 4", 210));
        playList.addTrack(new Track("Track 5", 240));

        // set any strategy here
        // e,g -> random, repeat, shuffle, sdf, ldf, etc.
        //playList.setPlayListStrategy(new RandomPlayListStrategy());
        //playList.setPlayListStrategy(new RepeatPlayListStrategy());
        playList.setPlayListStrategy(new ShortestDurationPlayListStrategy());

        // Play the tracks
        int i = 0;
        while (i < 5) {
            Track track = playList.getNextTrack();
            System.out.println("Playing: " + track.getTitle() + " - " + track.getDuration());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }

    }

}
