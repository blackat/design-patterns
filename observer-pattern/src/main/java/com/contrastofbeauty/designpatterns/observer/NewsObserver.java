package com.contrastofbeauty.designpatterns.observer;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 26/03/13
 */
public class NewsObserver implements Observer {

    private Subject subject;

    public NewsObserver(Subject s) {
        subject = s;
        s.registerObserver(this);
    }

    @Override
    public void update(News news) {
        System.out.println("new news published: " + news.toString());
    }
}
