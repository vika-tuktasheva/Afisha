package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
        //тест на добавление нового фильма
    void addNewMovies() {
        MovieManager manager = new MovieManager();
        String[] movieListTest = new String[]{"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        manager.setMoviesList(movieListTest);

        String[] expected = new String[]{"Film 1", "Film 2", "Film 3", "Film 4", "Film 5",
                "Film 6"};

        String addMovie = "Film 6";
        manager.add(addMovie);
        String[] actual = manager.getMoviesList();

        assertArrayEquals(expected, actual);
    }

    @Test
        //тест на вывод всех фильмов
    void outputAllMovies() {
        MovieManager manager = new MovieManager();
        String[] movieListTest = new String[]{"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        manager.setMoviesList(movieListTest);

        String[] expected = new String[]{"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};

        manager.outputAllMovies();
        String[] actual = manager.getMoviesList();

        assertArrayEquals(expected, actual);
    }

    @Test
        //тест на вывод списка в обратном порядке
        //используется менеджер по умолчанию
    void outputLastMoviesDefaultManager() {
        MovieManager manager = new MovieManager();

        String[] movieListTest = new String[]{"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        manager.setMoviesList(movieListTest);

        String[] expected = new String[]{"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.outputLastMovies();

        assertArrayEquals(expected, actual);
    }

    @Test
        //тест на вывод списка в обратном порядке
        //используется менеджер по умолчанию, фильмов > 10
    void outputLastMoviesDefaultManagerOver10() {
        MovieManager manager = new MovieManager();

        String[] movieListTest = new String[]{"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7",
                "Film 8", "Film 9", "Film 10", "Film 11", "Film 12"};
        manager.setMoviesList(movieListTest);

        String[] expected = new String[]{"Film 12", "Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6",
                "Film 5", "Film 4", "Film 3"};
        String[] actual = manager.outputLastMovies();

        assertArrayEquals(expected, actual);
    }

    @Test
        //тест на вывод списка в обратном порядке
        //используется менеджер с указанием лимита
    void outputLastMoviesManagerSetLimit() {
        MovieManager manager = new MovieManager(2);

        String[] movieListTest = new String[]{"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        manager.setMoviesList(movieListTest);

        String[] expected = new String[]{"Film 5", "Film 4"};
        String[] actual = manager.outputLastMovies();

        assertArrayEquals(expected, actual);
    }


}
