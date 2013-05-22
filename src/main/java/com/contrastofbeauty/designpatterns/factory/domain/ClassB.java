package com.contrastofbeauty.designpatterns.factory.domain;

/**
 * A class B car model.
 *
 * @author Eugenio Lentini
 */
public class ClassB extends AbstractCar {
    @Override
    public void assemble() {
        setAssembled(true);
    }

    @Override
    public void paint() {
        setPainted(true);
    }

    @Override
    public void mountWheels() {
        setWheelsMounted(true);
    }

    @Override
    public void test() {
        setTested(true);
    }
}
