package ru.netology.manager;

import ru.netology.domain.MovieItem;
import ru.netology.repository.MovieRepository;

public class MovieManager {

    private MovieRepository repository;
    private int maxLength = 10;

    public MovieManager(MovieRepository repository, int maxLength) {
        this.repository = repository;
        this.maxLength = maxLength;
    }

    public MovieManager(MovieRepository repository) {
        this.repository = repository;
    }

    public void add(MovieItem item) {
        repository.save(item);
    }

    public MovieItem[] getAll() {
        return repository.findAll();
    }

    public MovieItem[] getById(int id) {
        return repository.findById(id);
    }

    public void deleteById(int id) {
        repository.removeById(id);
    }

    public void deleteAll() {
        repository.removeAll();
    }

    public MovieItem[] findLast() {
        int resultLength;
        MovieItem[] items = repository.findAll();

        if (items.length >= this.maxLength) {
            resultLength = this.maxLength;
        } else {
            resultLength = items.length;
        }

        MovieItem[] result = new MovieItem[resultLength];

        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}
