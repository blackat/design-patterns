package com.contrastofbeauty.designpatterns.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 13/03/13
 */
public class Americano extends Coffee {

    /**
     * Constructor to set the name of the coffee.
     */
    public Americano() {
        super("Americano");
    }

    @Override
    public final double getCost() {
        return 1.10;
    }
}
