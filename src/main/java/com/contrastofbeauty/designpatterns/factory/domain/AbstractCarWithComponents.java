package com.contrastofbeauty.designpatterns.factory.domain;

import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Chassis;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Doors;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Fender;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Internals;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Wheels;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Windows;

/**
 * An abstraction of car components.
 *
 * @author Eugenio Lentini
 */
public abstract class AbstractCarWithComponents extends AbstractCar {
    /**
     * Fender instance.
     */
    private Fender fender;

    /**
     * Chassis instance.
     */
    private Chassis chassis;

    /**
     * Windows instance.
     */
    private Windows window;

    /**
     * Doors instance.
     */
    private Doors doors;

    /**
     * Wheels instance.
     */
    private Wheels wheels;

    /**
     * Internals instance.
     */
    private Internals internals;


    /**
     * Gets the components before entering in the different phases.
     */
    abstract void getComponents();

    /**
     * Set the fender for the car.
     *
     * @param carFender to be set
     */
    public final void setFender(final Fender carFender) {
        this.fender = carFender;
    }

    /**
     * Set the chassis for the car.
     *
     * @param carChassis to be set
     */
    public final void setChassis(final Chassis carChassis) {
        this.chassis = carChassis;
    }

    /**
     * @param carWindows to be set
     */
    public final void setWindow(final Windows carWindows) {
        this.window = carWindows;
    }

    /**
     * Set the doors for the car.
     *
     * @param carDoors to be set
     */
    public final void setDoors(final Doors carDoors) {
        this.doors = carDoors;
    }

    /**
     * Set the wheels for the car.
     *
     * @param carWheels to be set
     */
    public final void setWheels(final Wheels carWheels) {
        this.wheels = carWheels;
    }

    /**
     * Set the internals for the car.
     *
     * @param carInternals to be set
     */
    public final void setInternals(final Internals carInternals) {
        this.internals = carInternals;
    }
}
