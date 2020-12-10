package pl.wsb.students.course.service;

import pl.wsb.students.course.model.BluRayMovie;
import pl.wsb.students.course.model.DVDMovie;
import pl.wsb.students.course.model.Movie;
import pl.wsb.students.course.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class StoreManager {
    private List<Movie> movies;
    private List<Transaction> transactions;

    public StoreManager() {
        this.transactions = new ArrayList<>();
        this.initMoviesList();
    }

    private void initMoviesList() {
        this.movies = new ArrayList<>();
        this.movies.add(new DVDMovie("Star Wars", 9));
        this.movies.add(new DVDMovie("Star Trek", 9));
        this.movies.add(new BluRayMovie("Star Wars", 9));
        this.movies.add(new BluRayMovie("Star Trek", 9));
    }

}
