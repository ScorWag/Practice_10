package ru.netology.repository;

import ru.netology.domain.MovieItem;

public class MovieRepository {

    private MovieItem[] movies = new MovieItem[0];

    public MovieItem[] findAll() {
        return movies;
    }

    public void save(MovieItem item) {

        MovieItem[] tmp = new MovieItem[movies.length + 1];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = item;
        movies = tmp;
    }

    public void removeById(int id) {
        int length = movies.length - 1;
        MovieItem[] tmp = new MovieItem[length];
        int index = 0;
        for (MovieItem item : movies) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        movies = tmp;
    }

    public MovieItem[] findById(int id) {
        MovieItem[] tmp = new MovieItem[1];
        for (MovieItem item : movies) {
            if (item.getId() == id) {
                tmp[0] = item;
            }
        }
        return tmp;
    }

    public void removeAll() {
        MovieItem[] tmp = new MovieItem[0];
        movies = tmp;
    }
}
