package main.java.SmartEntertaimentManagementSystem.Music;

import java.util.List;

/**
🔹 A Musician has many albums (one-to-many relationship).
🔹 You can call musician.addAlbum(new Album(...)) to link them.
**/

public class Musician {

    private String name;

    private Integer yearsActive;

    private List<Album> albums;

    public Musician(String name, Integer yearsActive, List<Album> albums) {
        this.name = name;
        this.yearsActive = yearsActive;
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearsActive() {
        return yearsActive;
    }

    public void setYearsActive(Integer yearsActive) {
        this.yearsActive = yearsActive;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }
}
