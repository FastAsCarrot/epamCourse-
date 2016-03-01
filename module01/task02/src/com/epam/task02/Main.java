package com.epam.task02;

/**
 * Created by vrama on 27.02.2016.
 */
public class Main {
    public static void main(String...args) {
        double[] array = new double[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = 1.0/((i+1)*(i+1));
        }

        System.out.println("Array length: " + array.length);

        Logic.findMinElement(array, 0.3d);
    }
}
