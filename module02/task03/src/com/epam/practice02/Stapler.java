package com.epam.practice02;

/**
 * Created by vrama on 13.03.2016.
 */
public class Stapler extends StationaryObject {

    private int clipCapacity;
    private int clipsLeft;

    public Stapler(String name, double price, int clipCapacity) {
        super(name, price);
        this.clipCapacity = clipCapacity;
        this.clipsLeft = clipCapacity;
    }

    public void pierce() {
        System.out.println("Knack!\n");
        clipsLeft--;
    }

    public void rechargeStapler() {
        clipsLeft = clipCapacity;
    }

    public int getClipCapacity() {
        return clipCapacity;
    }

    public int getClipsLeft() {
        return clipsLeft;
    }
}
