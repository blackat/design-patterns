package com.contrastofbeauty.designpatterns.factory.simplefactory;

import com.contrastofbeauty.designpatterns.factory.domain.Car;
import org.apache.commons.lang.Validate;

/**
 * A car manufacturer.
 * @author Eugenio Lentini
 */
public class CarManufacturer {
    /**
     * The car factory.
     */
    private CarFactory carFactory;

    /**
     * Constructor.
     * @param factory factory object
     */
    public CarManufacturer(CarFactory factory) {
        this.carFactory = factory;
    }

    public Car buildCar(String model) {
        Car car = this.carFactory.createCarInstance(model);

        Validate.notNull(car, "Model " + model + " is not available for the build.");

        car.assemble();
        car.paint();
        car.mountWheels();
        car.test();

        return car;
    }
}
