package com.contrastofbeauty.designpatterns.factory.abstractfactory;

/**
 * A manufacturer for sport cars.
 *
 * @author Eugenio Lentini
 */
public class SportCarManufacturer extends AbstractCarComponentsManufacturer {

    /**
     * Class A model constant.
     */
    public static final String SLK_CLASS = "slk-class";

    /**
     * Class B model constant.
     */
    public static final String SLR_CLASS = "slr-class";

    @Override
    protected final AbstractCarWithComponents createCar(final String model) {

        CarComponentsFactory carComponentsFactory = new SportCarComponentsFactory();

        if (model.equalsIgnoreCase(SLK_CLASS)) {
            return new ClassSlkWithComponents(carComponentsFactory);
        } else if (model.equalsIgnoreCase(SLR_CLASS)) {
            return new ClassSlrWithComponents(carComponentsFactory);
        }
        return null;
    }
}
