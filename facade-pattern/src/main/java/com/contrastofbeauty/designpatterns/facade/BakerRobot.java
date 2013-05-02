package com.contrastofbeauty.designpatterns.facade;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 02/04/13
 */
public interface BakerRobot extends Robot {

    void mixIngredients();
    void setTemprerature();
    void setTimer();
    void cook();
    boolean isReady();
}
