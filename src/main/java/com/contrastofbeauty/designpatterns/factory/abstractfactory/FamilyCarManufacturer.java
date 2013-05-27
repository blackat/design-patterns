package com.contrastofbeauty.designpatterns.factory.abstractfactory;

import com.contrastofbeauty.designpatterns.factory.domain.AbstractCarComponentsManufacturer;
import com.contrastofbeauty.designpatterns.factory.domain.AbstractCarWithComponents;

/**
 * A manufacturer of car with components.
 *
 * @author Eugenio Lentini
 */
public class FamilyCarManufacturer extends AbstractCarComponentsManufacturer {

    /**
     * Class A model constant.
     */
    public static final String A_CLASS = "a-class";

    /**
     * Class B model constant.
     */
    public static final String B_CLASS = "b-class";

    @Override
    protected final AbstractCarWithComponents createCar(final String model) {

        CarComponentsFactory carComponentsFactory = new FamilyCarComponentsFactory();

        if (model.equalsIgnoreCase(A_CLASS)) {
            return new ClassSlkWithComponents(carComponentsFactory);
        } else if (model.equalsIgnoreCase(B_CLASS)) {
            return new ClassBWithComponents(carComponentsFactory);
        }
        return null;
    }
}
