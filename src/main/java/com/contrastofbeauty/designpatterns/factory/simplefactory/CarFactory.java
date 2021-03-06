package com.contrastofbeauty.designpatterns.factory.simplefactory;

import com.contrastofbeauty.designpatterns.factory.domain.AbstractCar;
import com.contrastofbeauty.designpatterns.factory.domain.ClassA;
import com.contrastofbeauty.designpatterns.factory.domain.ClassB;

/**
 * A car factory.
 *
 * @author Eugenio Lentini
 */
public class CarFactory {

    public static final String A_CLASS = "a-class";
    public static final String B_CLASS = "b-class";

    public AbstractCar createCarInstance(String model) {
        if (model.equalsIgnoreCase(A_CLASS)) {
            return new ClassA();
        } else if (model.equalsIgnoreCase(B_CLASS)) {
            return new ClassB();
        }
        return null;
    }
}
