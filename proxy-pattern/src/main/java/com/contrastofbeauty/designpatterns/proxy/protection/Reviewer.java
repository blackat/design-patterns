package com.contrastofbeauty.designpatterns.proxy.protection;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 22/03/13
 */
public class Reviewer {

    List<Movie> movieList;

    public Reviewer(List<Movie> list) {
        movieList = list;
    }

    public void spoilMovieTitle() {
        for (Movie movie : movieList) {
            movie.setTitle("spoiled");
        }
    }

    public void printMovieTiles() {
        for (Movie movie : movieList) {
            System.out.println(movie.getTitle());
        }
    }
}
