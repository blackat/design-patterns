package com.contrastofbeauty.designpatterns.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 13/03/13
 */
public class MacchiatoDecorator extends CondimentDecorator {

    public static final double MACCHIATO_COST = 0.50;

    private Coffee coffee;

    public MacchiatoDecorator(Coffee coffeeBeverage) {
        coffee = coffeeBeverage;
    }

    @Override
    public final String getDescription() {
        return coffee.getDescription() + ", Macchiato";
    }

    @Override
    public final double getCost() {
        return coffee.getCost() + MACCHIATO_COST;
    }
}
