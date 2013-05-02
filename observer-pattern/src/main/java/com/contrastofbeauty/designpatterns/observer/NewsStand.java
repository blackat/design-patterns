package com.contrastofbeauty.designpatterns.observer;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 26/03/13
 */
public class NewsStand {
    public static void main(String[] args) {
        NewsProvider newsProvider = new NewsProvider();

        Observer userOne = new NewsObserver(newsProvider);
        Observer userTwo = new NewsObserver(newsProvider);

        newsProvider.setNews(new News("New economy", "Barry Lindon", "Many new changes happened."));
    }
}
