package com.contrastofbeauty.designpatterns.factory.domain;

/**
 * A car.
 *
 * @author Eugenio Lentini
 */
public abstract class Car {

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
     * Return assembled value.
     * @return true if assembled.
     */
    public boolean isAssembled() {
        return assembled;
    }

    /**
     * Return painted value.
     * @return true if painted.
     */
    public boolean isPainted() {
        return painted;
    }

    /**
     * Return wheelMounted value.
     * @return true if wheels have been mounted.
     */
    public boolean isWheelsMounted() {
        return wheelsMounted;
    }

    /**
     * Return tested value.
     * @return true if tested.
     */
    public boolean isTested() {
        return tested;
    }

    /**
     * Sets the value of assembled.
     * @param assembled
     */
    public void setAssembled(boolean assembled) {
        this.assembled = assembled;
    }

    /**
     * Sets the value of painted.
     * @param painted
     */
    public void setPainted(boolean painted) {
        this.painted = painted;
    }

    /**
     * Sets the value of wheelsMounted.
     * @param wheelsMounted
     */
    public void setWheelsMounted(boolean wheelsMounted) {
        this.wheelsMounted = wheelsMounted;
    }

    /**
     * Sets the value of tested.
     * @param tested
     */
    public void setTested(boolean tested) {
        this.tested = tested;
    }
}
