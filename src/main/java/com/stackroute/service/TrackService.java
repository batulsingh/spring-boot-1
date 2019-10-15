package com.stackroute.service;

import com.stackroute.domain.Track;

import java.util.List;

public interface TrackService {

    public Track saveTrack(Track track);  // method to accept a user object to save and return the saved user object

    public List<Track> getAllTracks();  // returns all user objects stored in the database as a list of user objects

    public Track updateTrack(Track track);

    public void deleteTrack(Track track);
}
