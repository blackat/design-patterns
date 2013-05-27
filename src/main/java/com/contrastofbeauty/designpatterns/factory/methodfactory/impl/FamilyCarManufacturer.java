package com.contrastofbeauty.designpatterns.factory.methodfactory.impl;

import com.contrastofbeauty.designpatterns.factory.domain.AbstractCar;
import com.contrastofbeauty.designpatterns.factory.methodfactory.AbstractCarManufacturer;
import com.contrastofbeauty.designpatterns.factory.domain.ClassC;
import com.contrastofbeauty.designpatterns.factory.domain.ClassE;

/**
 * A family car manufacturer.
 *
 * @author Eugenio Lentini
 */
public class FamilyCarManufacturer extends AbstractCarManufacturer {

    public static final String C_CLASS = "c-class";
    public static final String E_CLASS = "e-class";

    @Override
    public AbstractCar createCar(final String model) {
        if (model.equalsIgnoreCase(C_CLASS)) {
            return new ClassC();
        } else if (model.equalsIgnoreCase(E_CLASS)) {
            return new ClassE();
        }
        return null;
    }
}
