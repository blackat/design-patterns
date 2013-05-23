package com.contrastofbeauty.designpatterns.factory.abstractfactory;

/**
 * A class A model characterized by having components.
 *
 * @author Eugenio Lentini
 */
public class ClassBWithComponents extends AbstractCarWithComponents {

    /**
     * Components factory.
     */
    private CarComponentsFactory carComponentsFactory;

    /**
     * Constructor.
     *
     * @param factory factory to get the car components.
     */
    public ClassBWithComponents(final CarComponentsFactory factory) {
        carComponentsFactory = factory;
    }

    @Override
    public void assemble() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void paint() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mountWheels() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void test() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public final void getComponents() {
        this.setChassis(carComponentsFactory.createChassis());
        this.setDoors(carComponentsFactory.createDoors());
        this.setFender(carComponentsFactory.createFender());
        this.setWheels(carComponentsFactory.createWheels());
        this.setInternals(carComponentsFactory.createInternals());
        this.setWindow(carComponentsFactory.createWindow());
    }
}
