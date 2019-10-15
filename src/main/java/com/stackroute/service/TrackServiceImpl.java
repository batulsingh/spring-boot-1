package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackServiceImpl implements TrackService {  // userservice implementation class implements userservice interface and overrides both the methods

    TrackRepository trackRepository;

    private static List<Track> tracks;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository){
        this.trackRepository = trackRepository;               // at runtime spring will provide this service a userRepository object via constructor dependency injection
    }
    @Override
    public Track saveTrack(Track track) {
        Track saveTrack = trackRepository.save(track);      // this save method comes from the jpa repository interface that our user repository interface extends
        return saveTrack;
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public Track updateTrack(Track track){
        Track tr  =trackRepository.save(track);
        return tr;
}

    @Override
    public void deleteTrack(Track track) {
        trackRepository.delete(track);
    }

    //public Track findById(String trackId) {
     //   for (Track track : tracks) {
      //      if (track.getTrackId() == trackId) {
      //          return track;
      //      }
      //  }
      //  return null;
}