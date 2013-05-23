package com.contrastofbeauty.designpatterns.factory.abstractfactory;

import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Chassis;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Doors;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Fender;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Internals;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.SportCarChassis;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.SportCarDoors;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.SportCarFender;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.SportCarInternals;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.SportCarWheels;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.SportCarWindows;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Wheels;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Windows;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 23/05/13
 */
public class SportCarComponentsFactory implements CarComponentsFactory {

    @Override
    public final Fender createFender() {
        return new SportCarFender();
    }

    @Override
    public final Chassis createChassis() {
        return new SportCarChassis();
    }

    @Override
    public final Windows createWindows() {
        return new SportCarWindows();
    }

    @Override
    public final Doors createDoors() {
        return new SportCarDoors();
    }

    @Override
    public final Wheels createWheels() {
        return new SportCarWheels();
    }

    @Override
    public final Internals createInternals() {
        return new SportCarInternals();
    }
}
