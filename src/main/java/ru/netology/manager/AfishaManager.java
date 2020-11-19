package ru.netology.manager;

import ru.netology.domain.FilmsInfo;

public class AfishaManager {
    private FilmsInfo[] films = new FilmsInfo[0];

    public void add(FilmsInfo film) {
        // создаём новый массив размером на единицу больше
        int length = films.length + 1;
        FilmsInfo[] tmp = new FilmsInfo[length];
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

    public FilmsInfo[] getAll() {
        FilmsInfo[] result = new FilmsInfo[films.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
