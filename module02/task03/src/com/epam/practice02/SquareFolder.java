package com.epam.practice02;

/**
 * Created by vrama on 13.03.2016.
 */
public class SquareFolder extends StationaryObject {

    private String color;
    private double sizeInCmX;
    private double sizeInCmY;

    public SquareFolder(String name, double price, String color, double size) {
        super(name, price);
        this.color = color;
        this.sizeInCmX = size;
        this.sizeInCmY = size;
    }

    public double getSizeInCmY() {
        return sizeInCmY;
    }

    public String getColor() {
        return color;
    }

    public double getSizeInCmX() {
        return sizeInCmX;
    }
}
