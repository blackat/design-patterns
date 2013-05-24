package com.contrastofbeauty.designpatterns.template;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Test the correct recipe execution.
 *
 * @author Eugenio Lentini
 */
public class AbstractPastaRecipeTest {

    /**
     * Carbonara pasta recipe variable.
     */
    private AbstractPastaRecipe carbonaraPastaRecipe;

    /**
     * Amatriciana pasta recipe variable.
     */
    private AbstractPastaRecipe amatricianaPastaRecipe;

    /**
     * Basic pasta recipe variable.
     */
    private AbstractPastaRecipe basicPastaRecipe;

    @Before
    public void setUp() {
        carbonaraPastaRecipe = new CarbonaraReceipe();
        amatricianaPastaRecipe = new AmatricianaPastaRecipe();
        basicPastaRecipe = Mockito.mock(AbstractPastaRecipe.class);
    }

    @Test
    public void testRecipeOrderExecution() throws Exception {

    }

    @Test
    public void testPrepareRecipe() throws Exception {

    }
}
