package com.contrastofbeauty.designpatterns.factory.simplefactory;

import com.contrastofbeauty.designpatterns.factory.domain.AbstractCar;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Test the car manufacturer.
 *
 * @author Eugenio Lentini
 */
public class CarManufacturerTest {

    private CarManufacturer carManufacturer;

    @Before
    public void setUp() {
        carManufacturer = new CarManufacturer(new CarFactory());
    }

    @Test
    public void testBuildCarExistingModelClassA() throws Exception {
        AbstractCar car = carManufacturer.buildCar("a-class");
        assertCarBuilt(car);
    }

    @Test
    public void testBuildCarExistingModelClassB() throws Exception {
        AbstractCar car = carManufacturer.buildCar("b-class");
        assertCarBuilt(car);
    }

    private void assertCarBuilt(AbstractCar car) throws Exception {
        assertTrue(car.isAssembled());
        assertTrue(car.isPainted());
        assertTrue(car.isWheelsMounted());
        assertTrue(car.isTested());
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test(expected = IllegalArgumentException.class)
    public void testBuildCarNotExistingModel() throws Exception {
        AbstractCar car = carManufacturer.buildCar("c-class");
        exception.expectMessage("Model c-class is not available for the build.");
    }
}
