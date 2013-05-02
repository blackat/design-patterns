package com.contrastofbeauty.designpatterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 14/03/13
 */
public class Singleton {
    private static Singleton instance;

    public int i = 1;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        } else {
            return instance;
        }
    }
}
