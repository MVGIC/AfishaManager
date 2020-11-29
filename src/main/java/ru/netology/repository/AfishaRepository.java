package ru.netology.repository;

import ru.netology.domain.Afisha;

public class AfishaRepository {
    private Afisha[] films = new Afisha[0];

    public void save(Afisha film) {
        int length = films.length + 1;
        Afisha[] tmp = new Afisha[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Afisha[] findAll() {
        return films;
    }

    public void removeById(int id) {
        int length = films.length - 1;
        Afisha[] tmp = new Afisha[length];
        int index = 0;
        for (Afisha film : films) {
            if (film.getId() != id) {
                tmp[index] = film;
                index++;
            }
        }
        films = tmp;
    }
}