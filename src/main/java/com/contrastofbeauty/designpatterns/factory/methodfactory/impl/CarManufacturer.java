package com.contrastofbeauty.designpatterns.factory.methodfactory.impl;

import com.contrastofbeauty.designpatterns.factory.domain.AbstractCar;
import com.contrastofbeauty.designpatterns.factory.domain.ClassA;
import com.contrastofbeauty.designpatterns.factory.domain.ClassB;

/**
 * A car manufacturer.
 *
 * @author Eugenio Lentini
 */
public class CarManufacturer extends com.contrastofbeauty.designpatterns.factory.domain.AbstractCarComponentsManufacturer {

    public static final String A_CLASS = "a-class";
    public static final String B_CLASS = "b-class";

    @Override
    public AbstractCar createCar(String model) {
        if (model.equalsIgnoreCase(A_CLASS)) {
            return new ClassA();
        } else if (model.equalsIgnoreCase(B_CLASS)) {
            return new ClassB();
        }
        return null;
    }
}
