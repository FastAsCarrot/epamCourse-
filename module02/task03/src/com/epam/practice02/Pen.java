package com.epam.practice02;

/**
 * Created by vrama on 12.03.2016.
 */
public class Pen extends StationaryObject {

    private String inkColor;
    private String pencilColor;

    public Pen(String name, double price, String inkColor, String pencilColor) {
        super(name, price);
        this.inkColor = inkColor;
        this.pencilColor = pencilColor;
    }

    public String getInkColor() {
        return inkColor;
    }

    public String getPencilColor() {
        return pencilColor;
    }
}
