package com.epam.practice02;

import java.util.Random;

/**
 * Created by vrama on 21.03.2016.
 */
public class NuclearShip {

    public boolean workingEngine() {
        if(NuclearShipEngine.wakeEngine() == true) {
            return true;
        } else {
            return false;
        }

    }
        static class NuclearShipEngine {
            static Random rand = new Random();
            static boolean engineIsOn = false;

            public static boolean wakeEngine() {

                 if (rand.nextInt(32)%2 == 0) {
                     System.out.println("Brrrrrr!!!");
                     engineIsOn = true;
                 } else {
                     System.out.println("BBr....");
                     System.out.println("Captain ! Engine is dead! ");
                     engineIsOn = false;
                 }

                return engineIsOn;

            }
        }
}
