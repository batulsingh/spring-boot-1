package com.stackroute.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Track {
    @Id
    String trackId;
    String trackName;
    String comments;


    public Track() {
    }

    public Track(String trackId, String trackName, String comments) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackId='" + trackId + '\'' +
                ", trackName='" + trackName + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

}
