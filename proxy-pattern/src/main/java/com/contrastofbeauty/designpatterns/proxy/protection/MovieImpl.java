package com.contrastofbeauty.designpatterns.proxy.protection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 22/03/13
 */
public class MovieImpl implements Movie {
    private String title;
    private List<String> actors;
    private List<String> comments;

    public MovieImpl(String t, String... a) {
        title = t;
        comments = new ArrayList<String>();
        actors = new ArrayList<String>();
        for (String s : a) {
            actors.add(s);
        }
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String t) {
        title = t;
    }

    @Override
    public List<String> getActors() {
        return actors;
    }

    @Override
    public void setActors(List<String> a) {
        actors = a;
    }

    @Override
    public void comment(String comment) {
        comments.add(comment);
    }
}
