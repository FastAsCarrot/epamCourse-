package com.epam.practice02;

import java.util.ArrayList;

/**
 * Created by vrama on 12.03.2016.
 */
public class Employee {

    private ArrayList<StationaryObject> stationary = new ArrayList<>();
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void addStationary(StationaryObject obj) {
        stationary.add(obj);
    }

    public double getStationaryPrice() {
        double price = 0.0;

        for(StationaryObject stat : stationary) {
            price += stat.price*stat.quantity;
        }

        return price;
    }

    public String getStationaryInformation() {
        String info = "";

        for(StationaryObject stat: stationary) {
            info += stat.objectName + ": \n" + "    Quantity: " + stat.quantity + "\n    Price: " + stat.price + "\n";
        }

        return info;
    }

    public void increaseQuantity(int quantity, String name) {
        stationary.stream().filter(stat -> stat.objectName.equals(name)).forEach(stat -> stat.quantity += quantity);
    }

    public void decreaseQuantity(int quantity, String name) {

        stationary.stream().filter(stat -> stat.objectName.equals(name)).forEach(stat -> {
            if (stat.quantity < quantity) {
                System.err.println("Actual quantity of stationary '" + stat.objectName + "' is lesser than quantity"
                        + " on which you trying to change\n");
            } else {
                stat.quantity -= quantity;
            }
        });
    }

    public String getName() {
        return name;
    }
}
