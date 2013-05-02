package com.contrastofbeauty.designpatterns.observer;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 26/03/13
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
