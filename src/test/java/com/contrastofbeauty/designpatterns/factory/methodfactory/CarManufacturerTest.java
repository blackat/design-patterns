package com.contrastofbeauty.designpatterns.factory.methodfactory;

import com.contrastofbeauty.designpatterns.factory.domain.AbstractCar;
import com.contrastofbeauty.designpatterns.factory.methodfactory.impl.CarManufacturer;
import com.contrastofbeauty.designpatterns.factory.methodfactory.impl.FamilyCarManufacturer;
import com.contrastofbeauty.designpatterns.factory.methodfactory.impl.SportCarManufacturer;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

/**
 * Test for car manufacturer implemented with a factory method.
 *
 * @author Eugenio Lentini
 */
public class CarManufacturerTest {

    private AbstractCarManufacturer carManufacturer;
    private AbstractCarManufacturer sportCarManufacturer;
    private AbstractCarManufacturer familyCarManufacturer;

    @Before
    public void setUp() {
        carManufacturer = new CarManufacturer();
        sportCarManufacturer = new SportCarManufacturer();
        familyCarManufacturer = new FamilyCarManufacturer();
    }

    @Test
    public void testCreateCarWithCarManufacturer() throws Exception {
        AbstractCar car = carManufacturer.buildCar(CarManufacturer.A_CLASS);
        assertCarBuilt(car);
    }

    @Test
    public void testCreateCarWithFamilyCarManufacturer() throws Exception {
        AbstractCar car = familyCarManufacturer.buildCar(FamilyCarManufacturer.C_CLASS);
        assertCarBuilt(car);
    }

    @Test
    public void testCreateCarWithSportCarManufacturer() throws Exception {
        AbstractCar car = sportCarManufacturer.buildCar(SportCarManufacturer.SLK_CLASS);
        assertCarBuilt(car);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testCreateCarWithCarManufacturerAndWrongModel() throws Exception {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Model slk-class is not available for the build.");
        AbstractCar car = carManufacturer.buildCar(SportCarManufacturer.SLK_CLASS);
    }

    private void assertCarBuilt(AbstractCar car) throws Exception {
        assertTrue(car.isAssembled());
        assertTrue(car.isPainted());
        assertTrue(car.isWheelsMounted());
        assertTrue(car.isTested());
    }
}
