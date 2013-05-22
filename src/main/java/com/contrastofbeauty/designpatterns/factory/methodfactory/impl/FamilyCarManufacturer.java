package com.contrastofbeauty.designpatterns.factory.methodfactory.impl;

import com.contrastofbeauty.designpatterns.factory.domain.AbstractCar;
import com.contrastofbeauty.designpatterns.factory.domain.ClassA;
import com.contrastofbeauty.designpatterns.factory.domain.ClassB;
import com.contrastofbeauty.designpatterns.factory.methodfactory.AbstractCarManufacturer;

/**
 * A family car manufacturer.
 *
 * @author Eugenio Lentini
 */
public class FamilyCarManufacturer extends AbstractCarManufacturer {

    public static final String C_CLASS = "c-class";
    public static final String E_CLASS = "e-class";

    @Override
    public AbstractCar createCar(String model) {
        if (model.equalsIgnoreCase(C_CLASS)) {
            return new ClassA();
        } else if (model.equalsIgnoreCase(E_CLASS)) {
            return new ClassB();
        }
        return null;
    }
}
