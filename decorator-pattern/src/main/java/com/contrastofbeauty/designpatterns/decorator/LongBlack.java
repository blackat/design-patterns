package com.contrastofbeauty.designpatterns.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 13/03/13
 */
public class LongBlack extends Coffee {

    /**
     * Constructor to set the name of the coffee.
     */
    public LongBlack() {
        super("Long and black coffee");
    }

    @Override
    public final double getCost() {
        return 1.40;
    }
}
