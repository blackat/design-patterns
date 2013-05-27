package com.contrastofbeauty.designpatterns.factory.domain;

import org.apache.commons.lang.Validate;

/**
 * A car manufacturer.
 *
 * @author Eugenio Lentini
 */
public abstract class AbstractCarComponentsManufacturer {

    /**
     * Default constructor.
     */
    public AbstractCarComponentsManufacturer() {

    }

    /**
     * Follows different phases to build a car.
     * @param model of the car to build
     * @return car built
     */
    public final AbstractCarWithComponents buildCar(final String model) {
        AbstractCarWithComponents car = createCar(model);

        Validate.notNull(car, "Model " + model + " is not available for the build.");

        car.assemble();
        car.paint();
        car.mountWheels();
        car.test();

        return car;
    }

    /**
     * Creates an instance of the car set up with all the components.
     * @param model of the car to set up
     * @return an set up instance of a car with components
     */
    protected abstract AbstractCarWithComponents createCar(final String model);
}
