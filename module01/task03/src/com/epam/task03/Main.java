package com.epam.task03;

/**
 * Created by vrama on 28.02.2016.
 */
public class Main {
    public static void main(String ... args) {
        double a = 1.0d;
        double b = 5.0d;
        double h = 0.03d;
        double arraySize = b/h;

        Logic.tanFunction(arraySize, a, b, h);
    }
}
