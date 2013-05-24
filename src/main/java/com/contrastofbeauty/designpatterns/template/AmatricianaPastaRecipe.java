package com.contrastofbeauty.designpatterns.template;

/**
 *  A recipe for the pasta amatriciana.
 */
public class AmatricianaPastaRecipe extends AbstractPastaRecipe {
    @Override
    void addPasta() {
        System.out.println("penne added.");
    }

    @Override
    void addCondiments() {
        System.out.println("bacon, pomodoro sauce, pecorino cheese added.");
    }

    @Override
    void hook() {
        System.out.println("pasta has been served.");
    }
}
