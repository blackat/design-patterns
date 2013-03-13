package com.contrastofbeauty.designpatterns.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 13/03/13
 */
public abstract class Coffee {

    /**
     * Description of the coffee.
     */
    private String description = "Simple coffe";

    /**
     * Cost of the coffee.
     */
    private double cost;

    /**
     * Default constructor.
     */
    public Coffee() {
    }

    /**
     * Constructor to set the description of the coffee.
     *
     * @param coffeeDescription the description of the coffee
     */
    public Coffee(final String coffeeDescription) {
        description = coffeeDescription;
    }

    /**
     * Getter for the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Getter for the cost of the coffee.
     *
     * @return the cost of the coffee
     */
    public abstract double getCost();
}
