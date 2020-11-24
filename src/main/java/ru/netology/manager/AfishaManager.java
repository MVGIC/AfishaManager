package ru.netology.manager;

import ru.netology.domain.Afisha;

public class AfishaManager {
    private Afisha[] films = new Afisha[0];

    private int filmsToShow = 10;

    public AfishaManager(int filmsToShow) {
        this.filmsToShow = filmsToShow;
    }

    public AfishaManager() {
    }

    public void add(Afisha film) {
        // создаём новый массив размером на единицу больше
        int length = films.length + 1;
        Afisha[] tmp = new Afisha[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < films.length; i++) {
        //   tmp[i] = films[i];
        // }
        System.arraycopy(films, 0, tmp, 0, films.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Afisha[] getAll() {
        Afisha[] result = new Afisha[films.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
