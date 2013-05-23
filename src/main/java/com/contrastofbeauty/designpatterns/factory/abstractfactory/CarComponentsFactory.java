package com.contrastofbeauty.designpatterns.factory.abstractfactory;

import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Chassis;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Doors;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Fender;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Internals;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Wheels;
import com.contrastofbeauty.designpatterns.factory.abstractfactory.domain.Windows;

/**
 * A car components factory interface.
 *
 * @author Eugenio Lentini
 */
public interface CarComponentsFactory {

    /**
     * Create a fender instance.
     *
     * @return fender instance
     */
    Fender createFender();

    /**
     * Create a chassis instance.
     *
     * @return chassis instance
     */
    Chassis createChassis();

    /**
     * Create a windows instance.
     *
     * @return windows instance
     */
    Windows createWindows();

    /**
     * Create a doors instance.
     *
     * @return doors instance
     */
    Doors createDoors();

    /**
     * Create a wheels instance.
     *
     * @return wheels instance
     */
    Wheels createWheels();

    /**
     * Create a internals instance.
     *
     * @return internals instance
     */
    Internals createInternals();
}
