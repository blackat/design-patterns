package com.contrastofbeauty.designpatterns.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 13/03/13
 */
public class Espresso extends Coffee {

    /**
     * Constructor to set the name of the coffee.
     */
    public Espresso() {
        super("Espresso");
    }
    @Override
    public final double getCost() {
        return 0.95;
    }
}
