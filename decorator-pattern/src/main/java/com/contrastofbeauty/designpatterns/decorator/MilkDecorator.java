package com.contrastofbeauty.designpatterns.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 13/03/13
 */
public class MilkDecorator extends CondimentDecorator {

    public static final double MILK_COST = .50;
    /**
     * Reference variable for composition.
     */
    private Coffee coffee;

    /**
     * Constructor.
     *
     * @param coffeeBeverage the component to be set
     */
    public MilkDecorator(final Coffee coffeeBeverage) {
        coffee = coffeeBeverage;
    }

    /**
     * Return the description of the beverage with condiments built by delegation.
     *
     * @return the full description
     */
    @Override
    public final String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    /**
     * Return the total cost of the beverage built by delegation.
     *
     * @return the final cost
     */
    @Override
    public final double getCost() {
        return coffee.getCost() + MILK_COST;
    }
}
