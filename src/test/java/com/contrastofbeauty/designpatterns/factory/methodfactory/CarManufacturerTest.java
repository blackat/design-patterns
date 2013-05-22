package com.contrastofbeauty.designpatterns.factory.methodfactory;

import org.junit.Before;

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

    public void testCreateCarWithCarManufacturer() throws Exception {

    }
}
