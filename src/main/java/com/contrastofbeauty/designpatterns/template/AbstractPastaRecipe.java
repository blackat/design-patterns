package com.contrastofbeauty.designpatterns.template;

/**
 * A template to prepare a basic pasta.
 *
 * @author Eugenio Lentini
 */
public abstract class AbstractPastaRecipe {

    /**
     * The algorithm to prepare a good dish of pasta.
     */
    final void prepareRecipe() {
        preparePot();
        boilWater();
        putSalt();
        addPasta();
        addCondiments();
        hook();
    }

    /**
     * Prepares the pot.
     */
    void preparePot() {
        System.out.println("pot ready.");
    }

    /**
     * Wait until water is boiling.
     */
    void boilWater() {
        System.out.println("water is boiling.");
    }

    /**
     * Put the salt into boiling water.
     */
    void putSalt() {
        System.out.println("put the salt.");
    }

    /**
     * Add a kind of pasta.
     */
    abstract void addPasta();

    /**
     * Add some condiments to pasta.
     */
    abstract void addCondiments();

    /**
     * To be override if new functionality has to be added.
     */
    void hook() {

    }
}