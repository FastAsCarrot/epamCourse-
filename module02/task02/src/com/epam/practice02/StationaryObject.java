package com.epam.practice02;

/**
 * Created by vrama on 12.03.2016.
 */
public class StationaryObject {

    public String objectName;
    public double price;
    public int quantity;

    public StationaryObject(String objectName, int quantity, double price) {
        this.objectName = objectName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "StationaryObject{" +
                "objectName='" + objectName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
