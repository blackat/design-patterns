package com.contrastofbeauty.designpatterns.factory.methodfactory;

import com.contrastofbeauty.designpatterns.factory.domain.AbstractCar;
import com.contrastofbeauty.designpatterns.factory.simplefactory.CarFactory;
import org.apache.commons.lang.Validate;

/**
 * A car manufacturer.
 *
 * @author Eugenio Lentini
 */
public abstract class AbstractCarManufacturer {
    /**
     * The car factory.
     */
    private CarFactory carFactory;

    /**
     * Default constructor.
     */
    public AbstractCarManufacturer() {

    }

    /**
     * Constructor.
     *
     * @param factory factory object
     */
    public AbstractCarManufacturer(CarFactory factory) {
        this.carFactory = factory;
    }

    public AbstractCar buildCar(String model) {
        AbstractCar car = this.carFactory.createCarInstance(model);

        Validate.notNull(car, "Model " + model + " is not available for the build.");

        car.assemble();
        car.paint();
        car.mountWheels();
        car.test();

        return car;
    }

    public abstract AbstractCar createCar(String model);
}
