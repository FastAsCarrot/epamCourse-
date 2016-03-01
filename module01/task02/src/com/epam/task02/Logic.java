package com.epam.task02;

import java.awt.*;

/**
 * Created by vrama on 27.02.2016.
 */
public class Logic {

    Logic() {

    }

    private static void printArray(double[] arr) {

        System.out.println("----Whole array----\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value" + i + ": " + arr[i]);
        }
    }

    protected static void findMinElement(double[] arr, double E) {

        double tempValue = 0.0d;
        int minCondIndex = 0;
        boolean firstMin = true;

           for (int i = 0; i < arr.length; i++) {
                //Initializing tempValue & minCondIndex for the first time.
               if (firstMin) {
                   if (arr[i] < E) {
                       tempValue = arr[i];
                       minCondIndex = i;
                       firstMin = false;
                   }
                //Finding min index of array element which satisfy main condition
               } else {
                   if (arr[i] < E) {
                       if (arr[i] < tempValue) {
                           tempValue = arr[i];
                           minCondIndex = i;
                       }
                   }
               }


           }


        System.out.println("Condition M: a[i] < " + E);
        if (firstMin == true) {
            System.out.println("\nWARNING: No satisfying values has been found !\n");
        } else {
            System.out.println("Index of min: " + minCondIndex + "\n");
        }

        printArray(arr);
    }

}
