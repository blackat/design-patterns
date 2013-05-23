package com.contrastofbeauty.designpatterns.factory.abstractfactory;

/**
 * An abstraction of car components.
 *
 * @author Eugenio Lentini
 */
public abstract class AbstractCarWithComponents {
    private String fender;
    private String chassis;
    private String window;
    private String doors;
    private String wheels;
    private String internals;

    /**
     * True if the car has been assembled.
     */
    private boolean assembled;

    /**
     * True if the car has been painted.
     */
    private boolean painted;

    /**
     * True if the wheels have been mounted.
     */
    private boolean wheelsMounted;

    /**
     * True if the car has been tested.
     */
    private boolean tested;

    /**
     * Assembles different parts of the car.
     */
    public abstract void assemble();

    /**
     * Paints the car.
     */
    public abstract void paint();

    /**
     * Mounts the wheels.
     */
    public abstract void mountWheels();

    /**
     * Does a test drive.
     */
    public abstract void test();

    /**
     * Gets the components before entering in the different phases.
     */
    public abstract void getComponents();

    public void setFender(String fender) {
        this.fender = fender;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setInternals(String internals) {
        this.internals = internals;
    }
}
