package com.contrastofbeauty.designpatterns.factory.domain;

import org.apache.commons.lang.Validate;

/**
 * A car manufacturer.
 *
 * @author Eugenio Lentini
 */
public abstract class AbstractCarManufacturer {

    /**
     * Default constructor.
     */
    public AbstractCarManufacturer() {

    }

    /**
     * Follows different phases to build a car.
     *
     * @param model of the car to build
     * @return a built car
     */
    public final AbstractCar buildCar(final String model) {
        AbstractCar car = createCar(model);

        Validate.notNull(car, "Model " + model + " is not available for the build.");

        car.assemble();
        car.paint();
        car.mountWheels();
        car.test();

        return car;
    }

    /**
     * Creates an instance of the car.
     *
     * @param model of the car to set up
     * @return a set up instance of a car
     */
    protected abstract AbstractCar createCar(final String model);
}
