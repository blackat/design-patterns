package com.contrastofbeauty.designpatterns.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 22/03/13
 */
public class MovieReviews {
    public static void main(String[] args) {
        new MovieReviews().run();
    }

    public void run() {
        Reviewer reviewer = new Reviewer(buildMovieList());
        try {
            reviewer.spoilMovieTitle();
        } catch (Exception e) {
            System.out.println("operation not permitted.");
        }
        reviewer.printMovieTiles();
    }

    public List<Movie> buildMovieList() {
        List<Movie> movieList = new ArrayList<Movie>();

        Movie forrestGumpMovie = new MovieImpl("Forrest Gump", "Tom Hanks", "Gary Sinise", "Robin Wright");
        InvocationHandler forrestGumpHandler = new InvocationHandlerImpl(forrestGumpMovie);
        Movie forrestGumpProxy = (Movie) Proxy.newProxyInstance(Movie.class.getClassLoader(), new Class[]{Movie.class}, forrestGumpHandler);

        Movie djangoMovie = new MovieImpl("Django", "Quentin Tarantino", "Jamie Foxx", "Franco Nero");
        InvocationHandler djangoHandler = new InvocationHandlerImpl(djangoMovie);
        Movie djangoProxy = (Movie) Proxy.newProxyInstance(Movie.class.getClassLoader(), new Class[]{Movie.class}, djangoHandler);

        movieList.add(forrestGumpProxy);
        movieList.add(djangoProxy);

        return movieList;
    }
}
