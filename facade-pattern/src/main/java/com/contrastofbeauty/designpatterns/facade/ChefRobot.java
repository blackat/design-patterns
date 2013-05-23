package com.contrastofbeauty.designpatterns.facade;

/**
 * Created with IntelliJ IDEA.
 * User: blackat
 * Date: 02/04/13
 */
public interface ChefRobot extends Robot {

    void prepareMeal(Meal meal);

    void isReady();
}
