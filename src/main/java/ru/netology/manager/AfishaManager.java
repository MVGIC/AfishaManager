package ru.netology.manager;

import ru.netology.domain.Afisha;
import ru.netology.repository.AfishaRepository;

public class AfishaManager {
    private AfishaRepository repository;
    private int filmsToShow = 10;

    private AfishaManager() {
    }

    public AfishaManager(AfishaRepository repository, int filmsToShow) {
        this.repository = repository;
        this.filmsToShow = filmsToShow;
    }

    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }

    public void add(Afisha film) {
        repository.save(film);
    }

    public Afisha[] getAll() {
        Afisha[] films = repository.findAll();
        Afisha[] result = new Afisha[Math.min(films.length, filmsToShow)];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public void removeById(int id) {
        repository.removeById(id);
    }
}
