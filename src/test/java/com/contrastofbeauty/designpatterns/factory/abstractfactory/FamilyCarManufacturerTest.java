package com.contrastofbeauty.designpatterns.factory.abstractfactory;

import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 *
 * @author Eugenio Lentini
 */
public class FamilyCarManufacturerTest {
    /**
     * Class A model constant.
     */
    public static final String A_CLASS = "a-class";

    private AbstractCarComponentsManufacturer manufacturer;

    @Before
    public void setUp() {
        manufacturer = new FamilyCarManufacturer();
    }

    @Test
    public void testCreateCar() throws Exception {
        AbstractCarWithComponents car = manufacturer.buildCar(A_CLASS);
    }
}
