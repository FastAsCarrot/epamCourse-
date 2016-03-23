package com.epam.practice02;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by vrama on 21.03.2016.
 */
public class NuclearShipTest {

    //Obviously, there is no need for the test, but in regards of practice. It is needed.
    @Test
    public void IsEngineWorkingProperly() {
        NuclearShip ship = new NuclearShip();

        assertTrue(ship.workingEngine());
    }
}
