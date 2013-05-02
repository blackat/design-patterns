package com.contrastofbeauty.designpatterns.observer;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 26/03/13
 */
public class News {
    private String title;
    private String author;
    private String content;

    public News(String t, String a, String c) {
        title = t;
        author = a;
        content = c;
    }

    @Override
    public String toString() {
        return title + " " + author + ": " + content;
    }
}
