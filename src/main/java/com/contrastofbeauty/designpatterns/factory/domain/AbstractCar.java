package com.contrastofbeauty.designpatterns.factory.domain;

/**
 * A car.
 *
 * @author Eugenio Lentini
 */
public abstract class AbstractCar {

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
    public final boolean isAssembled() {
        return assembled;
    }

    /**
     * Return painted value.
     * @return true if painted.
     */
    public final boolean isPainted() {
        return painted;
    }

    /**
     * Return wheelMounted value.
     * @return true if wheels have been mounted.
     */
    public final boolean isWheelsMounted() {
        return wheelsMounted;
    }

    /**
     * Return tested value.
     * @return true if tested.
     */
    public final boolean isTested() {
        return tested;
    }

    /**
     * Sets the value of assembled.
     * @param assembled
     */
    public final void setAssembled(final boolean assembled) {
        this.assembled = assembled;
    }

    /**
     * Sets the value of painted.
     * @param painted
     */
    public final void setPainted(final boolean painted) {
        this.painted = painted;
    }

    /**
     * Sets the value of wheelsMounted.
     * @param wheelsMounted
     */
    public final void setWheelsMounted(final boolean wheelsMounted) {
        this.wheelsMounted = wheelsMounted;
    }

    /**
     * Sets the value of tested.
     * @param tested
     */
    public final void setTested(final boolean tested) {
        this.tested = tested;
    }
}
