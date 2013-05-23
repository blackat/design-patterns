package com.contrastofbeauty.designpatterns.factory.abstractfactory;

import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Chassis;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Doors;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.FamilyCarChassis;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.FamilyCarDoors;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.FamilyCarFender;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.FamilyCarInternals;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.FamilyCarWheels;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.FamilyCarWindows;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Fender;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Internals;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Wheels;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Windows;

/**
 * Factory of the components for the class A model.
 *
 * @author Eugenio Lentini
 */
public class FamilyCarComponentsFactory implements CarComponentsFactory {
    @Override
    public final Fender createFender() {
        return new FamilyCarFender();
    }

    @Override
    public final Chassis createChassis() {
        return new FamilyCarChassis();
    }

    @Override
    public final Windows createWindows() {
        return new FamilyCarWindows();
    }

    @Override
    public final Doors createDoors() {
        return new FamilyCarDoors();
    }

    @Override
    public final Wheels createWheels() {
        return new FamilyCarWheels();
    }

    @Override
    public final Internals createInternals() {
        return new FamilyCarInternals();
    }
}
