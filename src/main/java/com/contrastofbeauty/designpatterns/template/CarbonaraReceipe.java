package com.contrastofbeauty.designpatterns.template;

/**
 * A recipe for the pasta carbonara.
 * @author Eugenio Lentini
 */
public class CarbonaraReceipe extends AbstractPastaRecipe {
    @Override
    void addPasta() {
        System.out.println("spaghetti added.");
    }

    @Override
    void addCondiments() {
        System.out.println("egg, bacon and parmigiano added.");
    }
}
