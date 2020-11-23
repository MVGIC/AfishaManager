package ru.netology.domain;

public class Afisha {
    private int id;
    private int filmsToShow = 10;
    private String filmName;

    public Afisha() {
    }

    public Afisha(int id, String filmName) {
        this.id = id;
        this.filmName = filmName;
    }

    public Afisha(int filmsToShow) {
        this.filmsToShow = filmsToShow;
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

    public int getFilmsToShow() {
        return filmsToShow;
    }

    public void setFilmsToShow(int filmsToShow) {
        this.filmsToShow = filmsToShow;
    }
}