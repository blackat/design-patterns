package com.contrastofbeauty.designpatterns.factory.domain;

/**
 * A class A car model.
 *
 * @author Eugenio Lentini
 */
public class ClassA extends Car {
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
