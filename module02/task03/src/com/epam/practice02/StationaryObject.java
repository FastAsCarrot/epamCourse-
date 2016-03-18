package com.epam.practice02;

/**
 * Created by vrama on 12.03.2016.
 */
public class StationaryObject {
    private String manufacturerName;
    private double price;

    public StationaryObject(String name, double price) {
        this.manufacturerName = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }
}
