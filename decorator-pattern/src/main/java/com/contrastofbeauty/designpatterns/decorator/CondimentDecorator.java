package com.contrastofbeauty.designpatterns.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 13/03/13
 */
public abstract class CondimentDecorator extends Coffee {

    /**
     * The description of the condiment decorator.
     *
     * @return the description
     */
    public abstract String getDescription();
}
