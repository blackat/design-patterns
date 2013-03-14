package com.contrastofbeauty.designpatterns.decorator;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 14/03/13
 */
public class DecoratorTest {

    private Coffee coffee;

    private CondimentDecorator condiment;

    @Before
    public void setUp() {
        coffee = new Espresso();
        condiment = new MilkDecorator(coffee);
    }

    @Test
    public void testDescription() throws Exception {
        assertEquals(condiment.getDescription(), "Espresso, Milk");
    }

    @Test
    public void testCost() throws Exception {
        assertEquals(condiment.getCost(), 1.45, 0.0);
    }
}
