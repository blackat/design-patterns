package com.contrastofbeauty.designpatterns.factory.abstractfactory;

import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 *
 * @author Eugenio Lentini
 */
public class SportCarManufacturerTest {
    /**
     * Class A model constant.
     */
    public static final String SLR_CLASS = "slr-class";

    private AbstractCarComponentsManufacturer manufacturer;

    @Before
    public void setUp() {
        manufacturer = new SportCarManufacturer();
    }

    @Test
    public void testCreateCar() throws Exception {
        AbstractCarWithComponents car = manufacturer.buildCar(SLR_CLASS);
    }
}
