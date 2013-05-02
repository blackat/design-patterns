package com.contrastofbeauty.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 26/03/13
 */
public class NewsProvider implements Subject {

    private List<Observer> observerList;
    private News news;

    public NewsProvider() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(news);
        }
    }

    void setNews(News n) {
        news = n;
        notifyObservers();
    }
}
