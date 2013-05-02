package com.contrastofbeauty.designpatterns.facade;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 02/04/13
 */
public class BreakfastFacadeImpl implements BreakfastFacade {

    BakerRobot bakerRobot;
    ChefRobot chefRobot;
    WaiterRobot waiterRobot;
    @Override
    public void prepareBreakfast() {

    }

    private void turnOnRobots() {
        bakerRobot.on();
        chefRobot.on();
    }
}
