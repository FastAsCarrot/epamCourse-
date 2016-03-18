package com.epam.practice02;

import org.junit.Test;
import org.junit.Assert.*;

/**
 * Created by vrama on 10.03.2016.
 */
public class ClericalAccountingTest {

    Employee emp = new Employee("Peter Jefferson");
    StationaryObject pen = new StationaryObject("Pen", 23, 3);
    StationaryObject crayon = new StationaryObject("Crayon", 566, 1);

    @Test
    public void stationaryTest() {

        emp.addStationary(pen);
        emp.addStationary(crayon);
        System.out.println("Full price: " + emp.getStationaryPrice() + "\n");
        System.out.println(emp.getStationaryInformation());

        emp.decreaseQuantity(24, "Pen");

    }

}
