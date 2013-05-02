package com.contrastofbeauty.designpatterns.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 15/03/13
 */
public class SingletonTest {

    @Test
    public void testSingletonShared() throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        assertEquals(2, s1.i=2);
        assertTrue("value changed", s1.i != 1);
    }
}
