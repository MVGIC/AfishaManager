package ru.netology.domain;


public class FilmsInfo {
    private int id;
    private String filmName;
    private int showLast = 10;

    public FilmsInfo(int id, String filmName) {
        this.id = id;
        this.filmName = filmName;
    }

    public FilmsInfo(int showLast) {
        this.showLast = showLast;
    }

    public FilmsInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getShowLast() {
        return showLast;
    }

    public void setShowLast(int showLast) {
        this.showLast = showLast;
    }
}