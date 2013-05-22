package com.contrastofbeauty.designpatterns.factory.abstractfactory;

/**
 * A car components factory interface.
 * @author Eugenio Lentini
 */
public interface CarComponentsFactory {
    String createFender();
    String createChassis();
    String createWindow();
    String createDoors();
    String createWheels();
    String createInternals();
}
