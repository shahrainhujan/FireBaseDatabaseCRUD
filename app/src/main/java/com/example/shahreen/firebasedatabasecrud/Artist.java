package com.example.shahreen.firebasedatabasecrud;

/**
 * Created by user on 2/11/2017.
 */

public class Artist {
    String artistId;
    String artistName;

    public Artist(String artistId) {
        this.artistId = artistId;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public Artist(){}
}
