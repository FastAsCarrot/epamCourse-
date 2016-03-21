package com.epam.practice02;

import java.util.Random;


@Author(
        name = "Pisarev Filipp",
        date = "21.03.2016"
)

@ClassDescription(
        information = "This class describes a model of nuclear ship, which is indeed very dangerous. It" +
                "is includes method workingEngine() and inner class NuclearShipEngine.Said by themselves",
        methodsName = {"workingEngine()"},
        innerClass = "NuclearShipEngine"

)

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
