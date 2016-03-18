package com.epam.practice02;

/**
 * Created by vrama on 13.03.2016.
 */
public class RectFolder extends SquareFolder {

    private double sizeX;
    private double sizeY;

    public RectFolder(String name, double price, String color, double sizeX, double sizeY) {
        super(name, price, color, sizeX);

        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public double getSizeX() {
        return sizeX;
    }

    public double getSizeY() {
        return sizeY;
    }
}
