package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
    private MovieItem[] movies = new MovieItem[0];
    private int maxLength = 10;

    public MovieManager() {
    }

    public MovieManager(int maxLength) {
        this.maxLength = maxLength;
    }

    public void add(MovieItem item) {
        MovieItem[] tmp = new MovieItem[movies.length + 1];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = item;
        movies = tmp;
    }

    public MovieItem[] findAll() {
        return movies;
    }

    public MovieItem[] findLast() {
        int resultLength;

        if (movies.length >= maxLength) {
            resultLength = maxLength;
        } else {
            resultLength = movies.length;
        }
        MovieItem[] items = findAll();
        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}
