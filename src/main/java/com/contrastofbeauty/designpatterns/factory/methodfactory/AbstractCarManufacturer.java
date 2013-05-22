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
     * Default constructor.
     */
    public AbstractCarManufacturer() {

    }

    public AbstractCar buildCar(String model) {
        AbstractCar car = createCar(model);

        Validate.notNull(car, "Model " + model + " is not available for the build.");

        car.assemble();
        car.paint();
        car.mountWheels();
        car.test();

        return car;
    }

    protected abstract AbstractCar createCar(String model);
}
