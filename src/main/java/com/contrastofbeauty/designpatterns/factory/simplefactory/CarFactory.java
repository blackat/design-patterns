package com.contrastofbeauty.designpatterns.factory.simplefactory;

import com.contrastofbeauty.designpatterns.factory.domain.Car;
import com.contrastofbeauty.designpatterns.factory.domain.ClassA;
import com.contrastofbeauty.designpatterns.factory.domain.ClassB;

/**
 * A car factory.
 *
 * @author Eugenio Lentini
 */
public class CarFactory {

    public static final String A_CLASS = "a-class";

    public Car createCarInstance(String model) {
        if (model.equalsIgnoreCase(A_CLASS)) {
            return new ClassA();
        } else if (model.equalsIgnoreCase("b-class")) {
            return new ClassB();
        }
        return null;
    }
}
