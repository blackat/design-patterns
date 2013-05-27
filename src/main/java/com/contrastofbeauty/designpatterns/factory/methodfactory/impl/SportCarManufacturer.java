package com.contrastofbeauty.designpatterns.factory.methodfactory.impl;

import com.contrastofbeauty.designpatterns.factory.domain.AbstractCar;
import com.contrastofbeauty.designpatterns.factory.methodfactory.AbstractCarManufacturer;
import com.contrastofbeauty.designpatterns.factory.domain.ClassA;
import com.contrastofbeauty.designpatterns.factory.domain.ClassB;

/**
 * A sport car manufacturer.
 *
 * @author Eugenio Lentini
 */
public class SportCarManufacturer extends AbstractCarManufacturer {

    public static final String SLK_CLASS = "slk-class";
    public static final String SLR_CLASS = "slr-class";

    @Override
    public AbstractCar createCar(final String model) {
        if (model.equalsIgnoreCase(SLK_CLASS)) {
            return new ClassA();
        } else if (model.equalsIgnoreCase(SLR_CLASS)) {
            return new ClassB();
        }
        return null;
    }
}
