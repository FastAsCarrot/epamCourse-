package com.epam.task05;

/**
 * Created by vrama on 28.02.2016.
 */
public class Logic {

    public Logic() {
    }

    protected static void matrixCreation(int size) {
        int[][] Matrix = new int[size][size];

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                if (j == i || j == size-1-i) {
                    Matrix[i][j] = 1;
                } else {
                    Matrix[i][j] = 0;
                }

                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
