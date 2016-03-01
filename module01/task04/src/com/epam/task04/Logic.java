package com.epam.task04;

import java.util.Random;

/**
 * Created by vrama on 28.02.2016.
 */
public class Logic {

    public Logic() {

    }

    private static double[] formArray(int arrayLength) {
        double[] arr = new double[arrayLength];
        Random rand = new Random();

        for (int i = 0; i < arrayLength; i++) {
            arr[i] = i + rand.nextInt(20);
        }

       return formSumArray(arr);
    }

    private static double[] formSumArray(double[] array) {
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i] + array[i+1];
            System.out.println("AR" + i + ": " + array[i]);
        }

        return array;
    }

    protected static void maxValue(int arrayLength) {
        double[] arr;
        double max = 0;

        arr = formArray(arrayLength);

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[i + 1]) {
                    max = arr[i + 1];
                }
            }
        }

        System.out.println("\nMAX value: " + max);
    }


}
