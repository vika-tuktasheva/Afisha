package ru.netology.domain;

public class MovieManager {
    private String[] moviesList = new String[0];
    private int limitLength = 10; //лимит выводимых фильмов

    //конструкторы
    public MovieManager() {
    }

    public MovieManager(int limitLength) {
        this.limitLength = limitLength;
    }

    //getter and setter
    public String[] getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(String[] moviesList) {
        this.moviesList = moviesList;
    }

    public int getLimitLength() {
        return limitLength;
    }

    public void setLimitLength(int limitLength) {
        this.limitLength = limitLength;
    }

    //методы
    //добавление нового фильма
    public void add(String movieAdd) {
        int length = moviesList.length + 1;
        String[] tmp = new String[length];
        for (int i = 0; i < length - 1; i++) {
            tmp[i] = moviesList[i];
        }
        tmp[length - 1] = movieAdd;
        moviesList = tmp;
    }

    //вывод всех фильмов в порядке добавления
    public void outputAllMovies() {
        getMoviesList();
    }

    //вывод последних добавленных фильмов в обратном порядке
    public String[] outputLastMovies() {
        int resultLength = moviesList.length;
        if (resultLength > limitLength) {
            resultLength = limitLength;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            int index = moviesList.length - i - 1;
            tmp[i] = moviesList[index];
        }
        //moviesList = tmp;
        return tmp;
    }
}
